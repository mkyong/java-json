package com.mkyong.json.jackson.tips;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkyong.json.model.Person;

import java.io.File;
import java.io.IOException;

public class ConvertObjectToJsonExample4 {

    public static void main(String[] args) {

        ObjectMapper om = new ObjectMapper();

        try {

            // read JSON from a file and convert it to Java object
            Person person = om.readValue(new File("person.json"), Person.class);

            System.out.println(person);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
