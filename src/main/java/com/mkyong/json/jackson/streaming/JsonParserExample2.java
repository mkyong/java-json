package com.mkyong.json.jackson.streaming;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.File;
import java.io.IOException;

public class JsonParserExample2 {

    public static void main(String[] args) {

        try (JsonParser jParser = new JsonFactory()
                .createParser(new File("user.json"));) {

            // JSON array?
            if (jParser.nextToken() == JsonToken.START_ARRAY) {

                while (jParser.nextToken() != JsonToken.END_ARRAY) {

                    // loop until token equal to "}"
                    while (jParser.nextToken() != JsonToken.END_OBJECT) {

                        String fieldName = jParser.currentName();
                        if ("name".equals(fieldName)) {
                            // current token is "name",
                            // move to next, which is "name"'s value
                            jParser.nextToken();
                            System.out.println(jParser.getText());
                        }

                        if ("age".equals(fieldName)) {
                            jParser.nextToken();
                            System.out.println(jParser.getIntValue());
                        }

                        if ("messages".equals(fieldName)) {

                            //jParser.nextToken(); // current token is "[", move next
                            if (jParser.nextToken() == JsonToken.START_ARRAY) {
                                // messages is array, loop until token equal to "]"
                                while (jParser.nextToken() != JsonToken.END_ARRAY) {
                                    System.out.println(jParser.getText());
                                }
                            }

                        }

                    }

                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
