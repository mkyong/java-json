package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mkyong.json.gson.model.Person;

public class GsonExcludeFieldExample4 {

    public static void main(String[] args) {

        GsonBuilder builder = new GsonBuilder();

        // Tells Gson object to respects @Expose annotations
        builder.excludeFieldsWithoutExposeAnnotation();

        Gson gson = builder.create();

        Person person = new Person(1, "mkyong", "password");

        String json = gson.toJson(person);

        System.out.println(json);

    }

}
