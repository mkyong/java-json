package com.mkyong.json.jackson.streaming;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

import java.io.IOException;
import java.io.StringWriter;

public class JsonGeneratorExample1 {

    public static void main(String[] args) {

        JsonFactory factory = new JsonFactory();
        StringWriter writer = new StringWriter();

        try (JsonGenerator generator = factory.createGenerator(writer)) {
            generator.writeStartObject();  // start root object
            generator.writeStringField("name", "mkyong");
            generator.writeNumberField("age", 42);
            generator.writeEndObject();    // end root object
            generator.close();

            String jsonOutput = writer.toString();
            System.out.println(jsonOutput);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
