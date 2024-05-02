package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mkyong.json.model.Person;

import java.lang.reflect.Type;
import java.util.List;

public class GsonParseJsonArrayExample {

    public static void main(String[] args) {

        String json = "[" +
                "{\"name\": \"mkyong\", \"age\": 20}," +
                "{\"name\": \"ah pig\", \"age\": 40}," +
                "{\"name\": \"ag dog\", \"age\": 30}" +
                "]";

        Gson gson = new Gson();

        // Create a List<Person> type token
        Type personListType = new TypeToken<List<Person>>() {}.getType();

        // Json array to List of objects
        List<Person> list = gson.fromJson(json, personListType);

        for (Person person : list) {
            System.out.println(person);
        }


    }
}
