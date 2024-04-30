package com.mkyong.json.moshi;

import com.mkyong.json.model.Person;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

public class PrettyPrintJsonExample {

    public static void main(String[] args) {

        Moshi moshi = new Moshi.Builder().build();

        // two spaces
        JsonAdapter<Person> jsonAdapter =
                moshi.adapter(Person.class).indent("  ");

        Person person = new Person("mkyong", 42);

        try {
            String json = jsonAdapter.toJson(person);
            System.out.println(json);
        } catch (Exception e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
        }

    }
}
