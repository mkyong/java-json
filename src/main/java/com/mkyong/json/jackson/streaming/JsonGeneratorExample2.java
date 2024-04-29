package com.mkyong.json.jackson.streaming;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonGeneratorExample2 {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try (JsonGenerator generator =
                     mapper.getFactory().createGenerator(new File("user.json"), JsonEncoding.UTF8)) {

            // pretty print
            generator.useDefaultPrettyPrinter();

            // start array
            generator.writeStartArray();                                   // [

            generator.writeStartObject();                                  // {
            generator.writeStringField("name", "mkyong");   // "name" : "mkyong"
            generator.writeNumberField("age", 42);          // "age" : 42

            generator.writeFieldName("messages");                          // "messages" :
            generator.writeStartArray();                                   // [
            generator.writeString("msg 1");                           // "msg 1"
            generator.writeString("msg 2");                           // "msg 2"
            generator.writeString("msg 3");                           // "msg 3"
            generator.writeEndArray();                                     // ]

            generator.writeEndObject();                                    // }

            // next

            generator.writeStartObject();                                  // {
            generator.writeStringField("name", "ah pig");   // "name" : "ah pig"
            generator.writeNumberField("age", 30);          // "age" : 30

            generator.writeFieldName("messages");                          // "messages" :
            generator.writeStartArray();                                   // [
            generator.writeString("a");                               // "a"
            generator.writeString("b");                               // "b"
            generator.writeString("c");                               // "c"
            generator.writeEndArray();                                     // ]

            generator.writeEndObject();                                    // }

            generator.writeEndArray();                                     // ]

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}