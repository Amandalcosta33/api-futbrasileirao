package com.amanda.springvscode.service;

import java.util.List;

import com.amanda.springvscode.dto.TabelaResponseDTO;
import com.amanda.springvscode.models.TeamProps;

public interface TeamService {

    public List<String> team(TeamProps teamProps) throws Exception;
    
}
