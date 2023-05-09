package com.amanda.springvscode.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.amanda.springvscode.dto.BrasileiraoResponseDTO;
import com.amanda.springvscode.models.ConfigProps;
import com.amanda.springvscode.service.BrasileiroService;
import com.amanda.springvscode.service.lmp.BrasileiroServicelmp;

@RestController
@RequestMapping("/")
public class AppController {

    @GetMapping("/campeonatos")
    public String allCampeonatos(@RequestHeader("authorization") String
    authorization) {
    String uString = "https://api.api-futebol.com.br/v1/campeonatos";
    RestTemplate restTemplate = new RestTemplateBuilder(
    rt -> rt.getInterceptors().add((request, body, execution) -> {
    request.getHeaders().add("Authorization", authorization);
    return execution.execute(request, body);
    })).build();
    return restTemplate.getForObject(uString, String.class);
    }

    @GetMapping("/brasileirao")
    public String brasileirao(@RequestHeader("authorization") String authorization) {
        ConfigProps configProps = new ConfigProps(authorization);
        BrasileiroService brService = new BrasileiroServicelmp();
        try {
            return brService.brasileirao(configProps);
            //return ResponseEntity.ok(new BrasileiraoResponseDTO(brService.brasileirao(configProps)));
        } catch (Exception e) {
            e.printStackTrace();
            return "ök";
           //return String.badRequest();
        }
    }

}