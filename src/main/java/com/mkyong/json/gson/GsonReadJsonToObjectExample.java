package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.mkyong.json.model.Person;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class GsonReadJsonToObjectExample {

    public static void main(String[] args) {

        Gson gson = new Gson();

        // Read JSON from a file
        try (Reader reader = new FileReader("person.json")) {

            // convert the JSON data to a Java object
            Person person = gson.fromJson(reader, Person.class);
            System.out.println(person);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
