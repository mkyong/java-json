package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.mkyong.json.model.Person;

public class GsonParseJsonStringExample {

    public static void main(String[] args) {

        String json = "{\"name\": \"mkyong\", \"age\": 20}";

        Gson gson = new Gson();

        Person person = gson.fromJson(json, Person.class);

        System.out.println(person);

    }
}
