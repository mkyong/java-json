package com.mkyong.json.jackson.tips;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkyong.json.model.Person;

import java.io.File;
import java.io.IOException;

public class ConvertObjectToJsonExample3 {

    public static void main(String[] args) {

        Person person = new Person("mkyong", 42);

        ObjectMapper om = new ObjectMapper();

        try {

            // convert Java object to JSON strings and save it to `person.json`
            om.writeValue(new File("person.json"), person);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
