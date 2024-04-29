package com.mkyong.json.moshi;

import com.mkyong.json.model.Person;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonToFileExample2 {

    public static void main(String[] args) {

        Moshi moshi = new Moshi.Builder().build();
        JsonAdapter<Person> jsonAdapter = moshi.adapter(Person.class);

        try {

            // Read JSON from a file
            String json = readJsonFromFile("person.json");

            Person person = jsonAdapter.fromJson(json);

            System.out.println(person);


        } catch (Exception e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
        }

    }

    private static String readJsonFromFile(String filePath) {
        try {
            byte[] jsonData = Files.readAllBytes(Paths.get(filePath));
            return new String(jsonData);
        } catch (IOException e) {
            System.err.println("Error reading JSON from file: " + e.getMessage());
            return null; // Return null or handle error appropriately
        }
    }

}
