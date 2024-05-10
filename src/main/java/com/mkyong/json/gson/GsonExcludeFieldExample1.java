package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.mkyong.json.gson.model.Person;

public class GsonExcludeFieldExample1 {

    public static void main(String[] args) {

        Gson gson = new Gson();

        Person person = new Person(1, "mkyong", "password");

        String json = gson.toJson(person);

        System.out.println(json);

    }

}
