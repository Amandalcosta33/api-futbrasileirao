package com.amanda.springvscode.models;

public class TeamProps {
    private String authorization;
    private String idCampeonato;
    private String ultimoResultado;

    public TeamProps(String authorization, String idCampeonato, String ultimoResultado) {
        this.authorization = authorization;
        this.idCampeonato = idCampeonato;
        this.ultimoResultado = ultimoResultado;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }
    
    public String getIdCampeonato() {
        return idCampeonato;
    }

    public void setIdCampeonato(String idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    public String getultimoResultado() {
        return ultimoResultado;
    }

    public void setultimoResultado(String ultimoResultado) {
        this.ultimoResultado = ultimoResultado;
    }

    
}
