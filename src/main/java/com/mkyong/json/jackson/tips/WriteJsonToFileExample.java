package com.mkyong.json.jackson.tips;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkyong.json.model.Person;

import java.io.File;
import java.io.IOException;

public class WriteJsonToFileExample {

    public static void main(String[] args) {

        Person person = new Person("mkyong", 42);

        ObjectMapper om = new ObjectMapper();

        try {

            // create a file object
            File file = new File("person.json");

            // write JSON to a File
            om
                    .writerWithDefaultPrettyPrinter()
                    .writeValue(file, person);

            System.out.println("Filed saved to: " + file.getAbsolutePath());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
