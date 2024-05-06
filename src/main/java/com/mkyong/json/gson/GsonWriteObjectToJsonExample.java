package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.mkyong.json.model.Person;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class GsonWriteObjectToJsonExample {

    public static void main(String[] args) {

        Person person = new Person("mkyong", 42);
        Gson gson = new Gson();

        // write to this file
        try (Writer writer = new FileWriter("person.json")) {

            // Convert the Java object `person` into a JSON data and write to a file
            gson.toJson(person, writer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
