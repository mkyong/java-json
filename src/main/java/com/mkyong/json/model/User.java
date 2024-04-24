package com.mkyong.json.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(value = {"name", "age"})
public class User {

    private String name;

    // This annotation ignores the age field during serialization and deserialization
    //@JsonIgnore
    private int age;

    private SecretData secret;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", secret=" + secret +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SecretData getSecret() {
        return secret;
    }

    public void setSecret(SecretData secret) {
        this.secret = secret;
    }
}
