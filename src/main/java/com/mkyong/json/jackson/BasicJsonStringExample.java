package com.mkyong.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BasicJsonStringExample {

    public static void main(String[] args) {

        try {

            // a simple JSON string
            String json = "{\"name\": \"mkyong\", \"age\": 20}";

            // Jackson main actor for data-binding between JSON and Java objects.
            ObjectMapper mapper = new ObjectMapper();

            // read the json strings and convert it into JsonNode
            JsonNode node = mapper.readTree(json);

            // display the JsonNode
            System.out.println("Name: " + node.get("name").asText());
            System.out.println("Age: " + node.get("age").asInt());

        } catch (JsonProcessingException e) {

            throw new RuntimeException(e);

        }

    }
}
