package com.amanda.springvscode.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TabelaResponseDTO {
        private String posicao;
        private String pontos;
        private String jogos;
        private String vitorias;
        private String empates;
        private String derrotas;
        @JsonProperty ("gols_pro")
        private String golsPro;
       @JsonProperty ("gols_contra")
        private String golsContra;
       @JsonProperty ("saldo_gols")
        private String saldoGols;
        private String aproveitamento;
       @JsonProperty ("variacao_posicao")
        private String variacaoPosicao;
       @JsonProperty ("ultimos_jogos")
        private String[] ultimosJogos;
        private Time time;

        public TabelaResponseDTO() {
            
        }
    
        public String getPosicao() {
            return posicao;
        }
    
        public void setPosicao(String posicao) {
            this.posicao = posicao;
        }

        public String getPontos() {
            return pontos;
        }
    
        public void setPontos(String pontos) {
            this.pontos = pontos;
        }

        public String getJogos() {
            return jogos;
        }
    
        public void setJogos(String jogos) {
            this.jogos = jogos;
        }

        public String getVitorias() {
            return vitorias;
        }
    
        public void setVitorias(String vitorias) {
            this.vitorias = vitorias;
        }

        public String getEmpates() {
            return empates;
        }
    
        public void setEmpates(String empates) {
            this.empates = empates;
        }

        public String getDerrotas() {
            return derrotas;
        }
    
        public void setDerrotas(String derrotas) {
            this.derrotas = derrotas;
        }

        public String getGolsPro() {
            return golsPro;
        }
    
        public void setGolsPro(String gols_pro) {
            this.golsPro = gols_pro;
        }

        public String getGolsContra() {
            return golsContra;
        }
    
        public void setGolsContra(String gols_contra) {
            this.golsContra = gols_contra;
        }

        public String getSaldoGols() {
            return saldoGols;
        }
    
        public void setSaldoGols(String saldo_gols) {
            this.saldoGols = saldo_gols;
        }

        public String getAproveitamento() {
            return aproveitamento;
        }
    
        public void setAproveitamento(String aproveitamento) {
            this.aproveitamento = aproveitamento;
        }

        public String getVariacao() {
            return variacaoPosicao;
        }
    
        public void setVariacao(String variacao_posicao) {
            this.variacaoPosicao = variacao_posicao;
        }

        public String[] getUltimosJogos() {
            return ultimosJogos;
        }
    
        public void setUltimosJogos(String[] ultimos_jogos) {
            this.ultimosJogos = ultimos_jogos;
        }

        public Time getTime() {
            return time;
        }
    
        public void setTime(Time time) {
            this.time = time;
        }

    
    }