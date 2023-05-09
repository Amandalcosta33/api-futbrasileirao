package com.amanda.springvscode.models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TabelaUser {
    public class ApiKeys {
        @JsonProperty("live")
        public String getLive() {
            return this.live;
        }

        public void setLive(String live) {
            this.live = live;
        }

        String live;

        @JsonProperty("test")
        public String getTest() {
            return this.test;
        }

        public void setTest(String test) {
            this.test = test;
        }

        String test;
    }

    public class Campeonato {
        @JsonProperty("campeonato_id")
        public int getCampeonato_id() {
            return this.campeonato_id;
        }

        public void setCampeonato_id(int campeonato_id) {
            this.campeonato_id = campeonato_id;
        }

        int campeonato_id;

        @JsonProperty("nome")
        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        String nome;

        @JsonProperty("slug")
        public String getSlug() {
            return this.slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        String slug;
    }

    public class Plano {
        @JsonProperty("tipo")
        public String getTipo() {
            return this.tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        String tipo;

        @JsonProperty("requisicoes")
        public int getRequisicoes() {
            return this.requisicoes;
        }

        public void setRequisicoes(int requisicoes) {
            this.requisicoes = requisicoes;
        }

        int requisicoes;

        @JsonProperty("data_vencimento")
        public String getData_vencimento() {
            return this.data_vencimento;
        }

        public void setData_vencimento(String data_vencimento) {
            this.data_vencimento = data_vencimento;
        }

        String data_vencimento;
    }

    public class Root {
        @JsonProperty("nome")
        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        String nome;

        @JsonProperty("sobrenome")
        public String getSobrenome() {
            return this.sobrenome;
        }

        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }

        String sobrenome;

        @JsonProperty("email")
        public String getEmail() {
            return this.email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        String email;

        @JsonProperty("organizacao")
        public String getOrganizacao() {
            return this.organizacao;
        }

        public void setOrganizacao(String organizacao) {
            this.organizacao = organizacao;
        }

        String organizacao;

        @JsonProperty("plano")
        public Plano getPlano() {
            return this.plano;
        }

        public void setPlano(Plano plano) {
            this.plano = plano;
        }

        Plano plano;

        @JsonProperty("api_keys")
        public ApiKeys getApi_keys() {
            return this.api_keys;
        }

        public void setApi_keys(ApiKeys api_keys) {
            this.api_keys = api_keys;
        }

        ApiKeys api_keys;

        @JsonProperty("campeonatos")
        public ArrayList<Campeonato> getCampeonatos() {
            return this.campeonatos;
        }

        public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
            this.campeonatos = campeonatos;
        }

        ArrayList<Campeonato> campeonatos;
    }

}
