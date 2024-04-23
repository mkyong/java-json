package com.mkyong.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class JsonToMapExample {

    public static void main(String[] args) throws JsonProcessingException {

        // JSON string
        String json = "{\"name\": \"mkyong\", \"age\": 20}";

        // Create an ObjectMapper instance.
        ObjectMapper mapper = new ObjectMapper();

        // convert JSON string to Map
        // uncheck assignment
        // Map<String, Object> map = mapper.readValue(json, Map.class);

        // Convert JSON string to Map
        // Map<String, Object> map = mapper.readValue(json, new TypeReference<Map<String, Object>>() {});
        Map<String, Object> map = mapper.readValue(json, new TypeReference<>() {
        });

        // Output the contents of the Map to verify the conversion
        System.out.println("Map content: " + map);

    }

}
