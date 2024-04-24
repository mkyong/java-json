package com.mkyong.json.jackson.tips;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkyong.json.model.Staff;

public class IgnoreNullFieldExample {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        // ignore null fields
        // mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        Staff staff = new Staff();
        staff.setName("mkyong");
        staff.setAge(42);

        try {

            String jsonOutput = mapper
                    .writerWithDefaultPrettyPrinter()
                    .writeValueAsString(staff);

            System.out.println(jsonOutput);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
