package com.mkyong.json.gson.streaming;

import com.google.gson.stream.JsonWriter;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWriterExample1 {

    public static void main(String[] args) {

        try (JsonWriter writer = new JsonWriter(new FileWriter("user.json"))) {

            // pretty print
            writer.setIndent("  ");

            writer.beginObject();                   // {
            writer.name("name").value("mkyong");    // "name" : "mkyong"
            writer.name("age").value(42);           // "age" : 42

            writer.name("messages");                // "messages" :
            writer.beginArray();                    // [
            writer.value(1);                        // 1,
            writer.value(2);                        // 2,
            writer.value(3);                        // 3
            writer.endArray();                      // ]

            writer.endObject();                     // }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
