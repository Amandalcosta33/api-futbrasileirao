package com.amanda.springvscode.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Time {

    @JsonProperty ("time_id")
    private String timeId;
   @JsonProperty ("nome_popular")
    private String nomePopular;
    private String  sigla;
    private String  escudo;

    public Time(){}

    public String getTimeId() {
        return timeId;
    }

    public void setTimeId(String time_id) {
        this.timeId = time_id;
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nome_popular) {
        this.nomePopular = nome_popular;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }
}
