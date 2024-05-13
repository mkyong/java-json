package com.mkyong.json.jsonsimple;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.mkyong.json.jsonsimple.model.Person;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonSimpleReadExample2 {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("person.json")) {

            JsonObject jsonObject = (JsonObject) Jsoner.deserialize(reader);

            // convert object to json, need manual, no ready api.
            // the simple of JSON.simple.
            Person person = new Person();
            person.setName((String) jsonObject.get("name"));
            person.setAge(((Number) jsonObject.get("age")).intValue());

            JsonArray jsonArray = (JsonArray) jsonObject.get("messages");
            List<String> messages = new ArrayList<>();
            for (Object obj : jsonArray) {
                messages.add((String) obj);
            }
            person.setMessages(messages);

            System.out.println(person);

        } catch (IOException | JsonException e) {
            throw new RuntimeException(e);
        }


    }

}
