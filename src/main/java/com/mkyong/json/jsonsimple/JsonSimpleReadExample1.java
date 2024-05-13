package com.mkyong.json.jsonsimple;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.FileReader;
import java.io.IOException;

public class JsonSimpleReadExample1 {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("person.json")) {

            JsonObject jsonObject = (JsonObject) Jsoner.deserialize(reader);

            // read value one by one manually
            System.out.println((String) jsonObject.get("name"));
            System.out.println(((Number) jsonObject.get("age")).intValue());

            JsonArray msg = (JsonArray) jsonObject.get("messages");
            for (Object o : msg) {
                System.out.println(o);
            }

        } catch (IOException | JsonException e) {
            throw new RuntimeException(e);
        }

    }

}
