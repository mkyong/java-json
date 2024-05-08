package com.mkyong.json.gson.streaming;

import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;

public class JsonReaderExample2 {

    public static void main(String[] args) {

        try (JsonReader reader = new JsonReader(new FileReader("user.json"))) {

            reader.beginArray(); // this is an json array
            while (reader.hasNext()) {

                reader.beginObject();

                while (reader.hasNext()) {

                    String name = reader.nextName();

                    switch (name) {
                        case "name" -> System.out.println(reader.nextString());
                        case "age" -> System.out.println(reader.nextInt());
                        case "messages" -> {
                            // read array
                            reader.beginArray();
                            while (reader.hasNext()) {
                                System.out.println(reader.nextString());
                            }
                            reader.endArray();
                        }
                        default -> reader.skipValue(); // skip others
                    }
                }
                reader.endObject();
            }

            reader.endArray();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
