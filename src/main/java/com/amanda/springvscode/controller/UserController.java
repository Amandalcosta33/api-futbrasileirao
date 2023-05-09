package com.amanda.springvscode.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.amanda.springvscode.models.TabelaUser;

@RestController
@RequestMapping("/")
public class UserController {
    @GetMapping("/user")
    public TabelaUser userAcess(@RequestHeader("authorization") String authorization) {
        try {
            String uString = "https://api.api-futebol.com.br/v1/me"; 
        RestTemplate restTemplate = new RestTemplateBuilder(
                rt -> rt.getInterceptors().add((request, body, execution) -> {
                    request.getHeaders().add("Authorization", authorization);
                    return execution.execute(request, body);
                })).build();
                TabelaUser response = restTemplate.getForObject(uString,  TabelaUser.class);
                return response;

        }
        catch(Exception ex) {
            System.out.println(ex);
            throw ex;
        }  
    }
}