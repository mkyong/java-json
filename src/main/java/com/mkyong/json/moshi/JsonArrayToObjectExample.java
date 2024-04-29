package com.mkyong.json.moshi;

import com.mkyong.json.model.Person;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;

import java.lang.reflect.Type;
import java.util.List;

public class JsonArrayToObjectExample {

    public static void main(String[] args) {

        Moshi moshi = new Moshi.Builder().build();

        // List<Person>
        Type type = Types.newParameterizedType(List.class, Person.class);
        JsonAdapter<List<Person>> adapter = moshi.adapter(type);

        // json array
        String json = "[{\"name\":\"mkyong\", \"age\":42}, {\"name\":\"ah pig\", \"age\":20}]";
        try {

            // convert json array to list of objects
            List<Person> list = adapter.fromJson(json);
            if (list != null) {
                for (Person person : list) {
                    System.out.println(person);
                }
            }

            // convert list of objects to json array
            String json2 = adapter.toJson(list);
            System.out.println(json2);


        } catch (Exception e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
        }

    }
}
