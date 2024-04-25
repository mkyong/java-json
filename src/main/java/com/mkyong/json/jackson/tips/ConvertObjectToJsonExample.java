package com.mkyong.json.jackson.tips;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkyong.json.model.Person;

public class ConvertObjectToJsonExample {

    public static void main(String[] args) {

        Person person = new Person("mkyong", 42);

        ObjectMapper om = new ObjectMapper();

        try {

            // covert Java object to JSON strings
            String json = om.writeValueAsString(person);

            // output: {"name":"mkyong","age":42}
            System.out.println(json);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
