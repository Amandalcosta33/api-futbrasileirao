package com.amanda.springvscode.models;

public class ConfigProps {
    private String authorization;

    public ConfigProps(String authorization) {
        this.authorization = authorization;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }
    
}
