package com.amanda.springvscode.controller;

import com.amanda.springvscode.models.TeamProps;
import com.amanda.springvscode.service.TeamService;
import com.amanda.springvscode.service.lmp.TeamServicelmp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ConfigApi {
    @GetMapping("/getteam/{idCampeonato}/{ultimoResultado}")
    public ResponseEntity<String> team(@RequestHeader("authorization") String authorization, @PathVariable String idCampeonato, @PathVariable String ultimoResultado) {
        try{
            List<String> resultadosValidos = Arrays.asList("d", "v", "e");
            if (idCampeonato.equals("10")){
        if (resultadosValidos.contains(ultimoResultado)){
            TeamProps teamProps = new TeamProps(authorization, idCampeonato, ultimoResultado);
            TeamService TService = new TeamServicelmp();
            return new ResponseEntity(TService.team(teamProps), HttpStatus.OK);
        } else {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body("Error on parameters in header: Result");
        }
    } else {
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body("Error on parameters in header : Championship");
    }
} catch (Exception e) {
    e.printStackTrace();
   return new ResponseEntity(HttpStatus.BAD_REQUEST);
}
    }

}
