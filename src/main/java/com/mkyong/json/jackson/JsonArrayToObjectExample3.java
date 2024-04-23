package com.mkyong.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkyong.json.model.Person;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonArrayToObjectExample3 {

    public static void main(String[] args) throws JsonProcessingException {

        // Create a list of Person objects
        List<Person> people = Arrays.asList(
                new Person("mkyong", 42),
                new Person("ah pig", 20)
        );

        // Wrap the list in a Map with "Person" as the key
        Map<String, List<Person>> wrapper = new HashMap<>();
        wrapper.put("Person", people);

        // Create an ObjectMapper instance and convert the map to JSON
        ObjectMapper mapper = new ObjectMapper();
        String jsonOutput = mapper.writeValueAsString(wrapper);

        // Print the JSON output
        // {"Person":[{"name":"mkyong","age":42},{"name":"ah pig","age":20}]}
        System.out.println(jsonOutput);

    }
}
