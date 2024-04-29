package com.mkyong.json.moshi;

import com.mkyong.json.model.Person;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

public class ObjectToJsonExample {

    public static void main(String[] args) {

        Moshi moshi = new Moshi.Builder().build();
        JsonAdapter<Person> jsonAdapter = moshi.adapter(Person.class);

        Person person = new Person("mkyong", 42);

        try {
            String json = jsonAdapter.toJson(person);
            System.out.println(json);

        } catch (Exception e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
        }

    }

}
