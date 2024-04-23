package com.mkyong.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BasicJsonArrayExample {

    public static void main(String[] args) {

        try {

            // a simple JSON array
            String json = "[" +
                    "{\"name\": \"mkyong\", \"age\": 20}," +
                    "{\"name\": \"ah pig\", \"age\": 40}," +
                    "{\"name\": \"ag dog\", \"age\": 30}" +
                    "]";

            // Jackson main object
            ObjectMapper mapper = new ObjectMapper();

            // read the json strings and convert it into JsonNode
            JsonNode arrayNode = mapper.readTree(json);

            // is this a array?
            if (arrayNode.isArray()) {
                // yes, loop the JsonNode and display one by one
                for (JsonNode node : arrayNode) {
                    System.out.println("Name: " + node.get("name").asText());
                    System.out.println("Age: " + node.get("age").asInt());
                }
            }

        } catch (JsonProcessingException e) {

            throw new RuntimeException(e);

        }

    }
}
