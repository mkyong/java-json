package com.mkyong.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkyong.json.model.Person;

import java.util.List;
import java.util.Map;

public class JsonArrayToObjectExample4 {

    public static void main(String[] args) throws JsonProcessingException {

        String jsonInput = "{\"Person\":[{\"name\":\"mkyong\",\"age\":42},{\"name\":\"ah pig\",\"age\":20}]}";

        // Create ObjectMapper instance
        ObjectMapper mapper = new ObjectMapper();

        // Convert JSON string to Map<String, List<Person>>
        Map<String, List<Person>> result = mapper.readValue(jsonInput, new TypeReference<>() {
        });

        // Retrieve the list of persons
        List<Person> persons = result.get("Person");

        // Print the parsed persons
        for (Person person : persons) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }


    }
}
