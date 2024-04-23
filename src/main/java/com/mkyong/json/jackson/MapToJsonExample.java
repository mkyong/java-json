package com.mkyong.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class MapToJsonExample {

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> map = new HashMap<>();
        map.put("name", "mkyong");
        map.put("age", 20);

        // convert map to JSON string
        String json = mapper.writeValueAsString(map);

        System.out.println(json);   // compact-print

        // enable pretty-print
        json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);

        System.out.println(json);   // pretty-print

    }

}
