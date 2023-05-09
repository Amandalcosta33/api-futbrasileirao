package com.amanda.springvscode.service.lmp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import com.amanda.springvscode.config.ConfigEnv;
import com.amanda.springvscode.dto.TabelaResponseDTO;
import com.amanda.springvscode.models.TeamProps;
import com.amanda.springvscode.service.TeamService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TeamServicelmp implements TeamService {

    private ObjectMapper objMapper = new ObjectMapper();

    @Override
    public List<String> team(TeamProps teamProps) throws Exception {
        try {
            RestTemplate restTemplate = new RestTemplateBuilder(
                    rt -> rt.getInterceptors().add((request, body, execution) -> {
                        request.getHeaders().add("Authorization", teamProps.getAuthorization());
                        return execution.execute(request, body);
                    })).build();
            String rString = restTemplate.getForObject(
                    ConfigEnv.API_URL + "/campeonatos/" + teamProps.getIdCampeonato() + "/tabela",
                    String.class);
            List<TabelaResponseDTO> tDto = objMapper.readValue(rString,new TypeReference<List<TabelaResponseDTO>>(){});
            List<String> nomes = tDto.stream().filter(f -> f.getUltimosJogos()[0].equals(teamProps.getultimoResultado())).map(f -> f.getTime().getNomePopular()).collect(Collectors.toList());
            return nomes;

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error");
        }
    }
}
