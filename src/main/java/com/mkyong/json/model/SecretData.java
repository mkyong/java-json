package com.mkyong.json.model;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@JsonIgnoreType
public class SecretData {
    private String password;
    private String type;

    public SecretData(String password, String type) {
        this.password = password;
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
