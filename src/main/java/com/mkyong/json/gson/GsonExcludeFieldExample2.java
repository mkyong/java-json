package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mkyong.json.gson.exclude.PasswordExclusionStrategy;
import com.mkyong.json.gson.model.Person;

public class GsonExcludeFieldExample2 {

    public static void main(String[] args) {

        GsonBuilder builder = new GsonBuilder();
        builder.setExclusionStrategies(new PasswordExclusionStrategy());
        Gson gson = builder.create();

        Person person = new Person(1, "mkyong", "password");

        String json = gson.toJson(person);

        System.out.println(json);

    }

}
