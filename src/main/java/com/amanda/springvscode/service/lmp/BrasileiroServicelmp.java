package com.amanda.springvscode.service.lmp;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import com.amanda.springvscode.config.ConfigEnv;
import com.amanda.springvscode.dto.BrasileiraoResponseDTO;
import com.amanda.springvscode.models.ConfigProps;
import com.amanda.springvscode.service.BrasileiroService;

public class BrasileiroServicelmp implements BrasileiroService {

    @Override
    public String brasileirao(ConfigProps props) throws Exception {
        try {
            RestTemplate restTemplate = new RestTemplateBuilder(
                    rt -> rt.getInterceptors().add((request, body, execution) -> {
                        request.getHeaders().add("Authorization", props.getAuthorization());
                        return execution.execute(request, body);
                    })).build();
            return restTemplate.getForObject(ConfigEnv.API_URL, String.class);
        } catch (Exception e) {
            throw new Exception("erro");
        }
    }

}
