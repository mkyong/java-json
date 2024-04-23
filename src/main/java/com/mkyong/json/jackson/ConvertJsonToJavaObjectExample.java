package com.mkyong.json.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkyong.json.model.Staff;

import java.io.File;
import java.io.IOException;

public class ConvertJsonToJavaObjectExample {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static void main(String[] args) throws IOException {

        // Convert JSON file to Java object
        Staff staff = MAPPER.readValue(new File("output.json"), Staff.class);

        System.out.println(staff);

        // Convert JSON string to Java object
        String jsonInString = "{\"name\":\"mkyong\",\"age\":37,\"skills\":[\"java\",\"python\"]}";
        Staff staff2 = MAPPER.readValue(jsonInString, Staff.class);

        // convert compact to pretty-print
        String staff2PrettyPrint = MAPPER
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(staff2);

        System.out.println(staff2PrettyPrint);

    }

}
