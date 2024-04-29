package com.mkyong.json.jackson.streaming;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;
import java.io.StringReader;

public class JsonParserExample1 {

    public static void main(String[] args) {

        String json = "{\"name\":\"mkyong\",\"age\":42}";

        JsonFactory factory = new JsonFactory();
        try (JsonParser parser = factory.createParser(new StringReader(json))) {
            while (parser.nextToken() != JsonToken.END_OBJECT) {

                // Deprecated alias of currentName().
                // Deprecated Since 2.17 use currentName instead.
                // String fieldName = parser.getCurrentName();

                String fieldName = parser.currentName();

                if ("name".equals(fieldName)) {
                    parser.nextToken();
                    System.out.println("Name: " + parser.getText());
                } else if ("age".equals(fieldName)) {
                    parser.nextToken();
                    System.out.println("Age: " + parser.getIntValue());
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
