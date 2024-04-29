package com.mkyong.json.moshi;

import com.mkyong.json.model.Person;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

public class JsonToObjectExample {

    public static void main(String[] args) {

        Moshi moshi = new Moshi.Builder().build();
        JsonAdapter<Person> jsonAdapter = moshi.adapter(Person.class);

        //Person person = new Person("mkyong", 42);
        String json = "{\"name\":\"mkyong\",\"age\":42}";
        try {
            Person person = jsonAdapter.fromJson(json);
            System.out.println(person);
        } catch (Exception e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
        }

    }

}
