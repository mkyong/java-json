package com.mkyong.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkyong.json.model.Person;

import java.util.List;

public class JsonArrayToObjectExample {

    public static void main(String[] args) throws JsonProcessingException {

        String jsonArray = "[{\"name\":\"mkyong\", \"age\":42}, {\"name\":\"ah pig\", \"age\":20}]";

        ObjectMapper mapper = new ObjectMapper();

        // 1. convert JSON array to Array objects
        Person[] person1 = mapper.readValue(jsonArray, Person[].class);
        for (Person p : person1) {
            System.out.println(p);
        }

        // 2. convert JSON array to List
        List<Person> person2 = mapper.readValue(jsonArray, new TypeReference<>() {
        });
        person2.forEach(System.out::println);

        //String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person2);
        //System.out.println(result);

    }
}
