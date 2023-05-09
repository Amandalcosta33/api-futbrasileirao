package com.amanda.springvscode.models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TabelaModels {
    public class GrupoPrincipal {
        @JsonProperty("posicao")
        public int getPosicao() {
            return this.posicao;
        }

        public void setPosicao(int posicao) {
            this.posicao = posicao;
        }

        int posicao;

        @JsonProperty("pontos")
        public int getPontos() {
            return this.pontos;
        }

        public void setPontos(int pontos) {
            this.pontos = pontos;
        }

        int pontos;

        @JsonProperty("time")
        public Time getTime() {
            return this.time;
        }

        public void setTime(Time time) {
            this.time = time;
        }

        Time time;

        @JsonProperty("jogos")
        public int getJogos() {
            return this.jogos;
        }

        public void setJogos(int jogos) {
            this.jogos = jogos;
        }

        int jogos;

        @JsonProperty("vitorias")
        public int getVitorias() {
            return this.vitorias;
        }

        public void setVitorias(int vitorias) {
            this.vitorias = vitorias;
        }

        int vitorias;

        @JsonProperty("empates")
        public int getEmpates() {
            return this.empates;
        }

        public void setEmpates(int empates) {
            this.empates = empates;
        }

        int empates;

        @JsonProperty("derrotas")
        public int getDerrotas() {
            return this.derrotas;
        }

        public void setDerrotas(int derrotas) {
            this.derrotas = derrotas;
        }

        int derrotas;

        @JsonProperty("gols_pro")
        public int getGols_pro() {
            return this.gols_pro;
        }

        public void setGols_pro(int gols_pro) {
            this.gols_pro = gols_pro;
        }

        int gols_pro;

        @JsonProperty("gols_contra")
        public int getGols_contra() {
            return this.gols_contra;
        }

        public void setGols_contra(int gols_contra) {
            this.gols_contra = gols_contra;
        }

        int gols_contra;

        @JsonProperty("saldo_gols")
        public int getSaldo_gols() {
            return this.saldo_gols;
        }

        public void setSaldo_gols(int saldo_gols) {
            this.saldo_gols = saldo_gols;
        }

        int saldo_gols;

        @JsonProperty("aproveitamento")
        public double getAproveitamento() {
            return this.aproveitamento;
        }

        public void setAproveitamento(double aproveitamento) {
            this.aproveitamento = aproveitamento;
        }

        double aproveitamento;

        @JsonProperty("variacao_posicao")
        public int getVariacao_posicao() {
            return this.variacao_posicao;
        }

        public void setVariacao_posicao(int variacao_posicao) {
            this.variacao_posicao = variacao_posicao;
        }

        int variacao_posicao;

        @JsonProperty("ultimos_jogos")
        public ArrayList<String> getUltimos_jogos() {
            return this.ultimos_jogos;
        }

        public void setUltimos_jogos(ArrayList<String> ultimos_jogos) {
            this.ultimos_jogos = ultimos_jogos;
        }

        ArrayList<String> ultimos_jogos;
    }

    public class Root {
        @JsonProperty("taca-guanabara-fase-de-grupos")
        public TacaGuanabaraFaseDeGrupos getTacaGuanabaraFaseDeGrupos() {
            return this.tacaGuanabaraFaseDeGrupos;
        }

        public void setTacaGuanabaraFaseDeGrupos(TacaGuanabaraFaseDeGrupos tacaGuanabaraFaseDeGrupos) {
            this.tacaGuanabaraFaseDeGrupos = tacaGuanabaraFaseDeGrupos;
        }

        TacaGuanabaraFaseDeGrupos tacaGuanabaraFaseDeGrupos;
    }

    public class TacaGuanabaraFaseDeGrupos {
        @JsonProperty("grupo-principal")
        public ArrayList<GrupoPrincipal> getGrupoPrincipal() {
            return this.grupoPrincipal;
        }

        public void setGrupoPrincipal(ArrayList<GrupoPrincipal> grupoPrincipal) {
            this.grupoPrincipal = grupoPrincipal;
        }

        ArrayList<GrupoPrincipal> grupoPrincipal;
    }

    public class Time {
        @JsonProperty("time_id")
        public int getTime_id() {
            return this.time_id;
        }

        public void setTime_id(int time_id) {
            this.time_id = time_id;
        }

        int time_id;

        @JsonProperty("nome_popular")
        public String getNome_popular() {
            return this.nome_popular;
        }

        public void setNome_popular(String nome_popular) {
            this.nome_popular = nome_popular;
        }

        String nome_popular;

        @JsonProperty("sigla")
        public String getSigla() {
            return this.sigla;
        }

        public void setSigla(String sigla) {
            this.sigla = sigla;
        }

        String sigla;

        @JsonProperty("escudo")
        public String getEscudo() {
            return this.escudo;
        }

        public void setEscudo(String escudo) {
            this.escudo = escudo;
        }

        String escudo;
    }

}
