package com.mkyong.json.jackson.tips;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.mkyong.json.model.Person;

public class PrettyPrintJsonExample {

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        // enable the pretty print globally
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        Person person = new Person("mkyong", 42);

        /*String json = mapper
                .writerWithDefaultPrettyPrinter() // enable pretty print
                .writeValueAsString(person);*/

        String json = mapper.writeValueAsString(person); // compact-print

        System.out.println(json);

    }
}
