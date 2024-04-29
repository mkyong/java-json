package com.mkyong.json.moshi;

import com.mkyong.json.model.Person;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonToFileExample {

    public static void main(String[] args) {

        Moshi moshi = new Moshi.Builder().build();
        JsonAdapter<Person> jsonAdapter = moshi.adapter(Person.class);

        Person person = new Person("mkyong", 42);

        try {

            String json = jsonAdapter.toJson(person);

            System.out.println(json);

            // write JSON to a file
            writeJsonToFile(json, "person.json");

        } catch (Exception e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
        }

    }

    private static void writeJsonToFile(String json, String filePath) {
        try {
            Files.write(Paths.get(filePath), json.getBytes());
            System.out.println("JSON written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing JSON to file: " + e.getMessage());
        }
    }

}
