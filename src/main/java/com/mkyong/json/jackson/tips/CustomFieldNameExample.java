package com.mkyong.json.jackson.tips;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkyong.json.model.Person;

/**
     import com.fasterxml.jackson.annotation.JsonProperty;

     public class Person {

        @JsonProperty("nick_name")
        private String name;

        private int age;
    }
 */
public class CustomFieldNameExample {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        String json = "{\"nick_name\":\"mkyong\",\"age\":42}";

        Person person = mapper.readValue(json, Person.class);

        System.out.println(person);

        String newJson = mapper.writeValueAsString(person);

        System.out.println(newJson);

    }

}
