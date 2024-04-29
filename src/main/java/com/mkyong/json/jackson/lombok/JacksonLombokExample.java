package com.mkyong.json.jackson.lombok;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonLombokExample {

    public static void main(String[] args) {

        try {

            ObjectMapper om = new ObjectMapper();

            Person person = new Person("mkyong", 42);

            // Serialize the Person object to JSON
            String jsonOutput = om.writeValueAsString(person);
            System.out.println("Serialized JSON: " + jsonOutput);

            // Deserialize the JSON back to a Person object
            Person deserializedPerson = om.readValue(jsonOutput, Person.class);
            System.out.println("Deserialized Person: " + deserializedPerson);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
