package com.mkyong.json.jackson.tips;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkyong.json.model.Person;

public class ConvertObjectToJsonExample2 {

    public static void main(String[] args) {

        String json = "{\"name\": \"mkyong\", \"age\": 20}";

        ObjectMapper om = new ObjectMapper();

        try {

            // covert JSON to Java object
            Person person = om.readValue(json, Person.class);

            // output: Person{name='mkyong', age=20}
            System.out.println(person);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


    }
}
