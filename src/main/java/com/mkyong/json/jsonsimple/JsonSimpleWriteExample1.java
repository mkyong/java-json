package com.mkyong.json.jsonsimple;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.FileWriter;
import java.io.IOException;

public class JsonSimpleWriteExample1 {

    public static void main(String[] args) {

        JsonObject jsonObject = new JsonObject();
        jsonObject.put("name", "mkyong");
        jsonObject.put("age", 42);

        JsonArray list = new JsonArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");

        jsonObject.put("messages", list);

        try (FileWriter fileWriter = new FileWriter("person.json")) {

            Jsoner.serialize(jsonObject, fileWriter);

            // pretty print
            // Jsoner.prettyPrint(new StringReader(jsonObject.toJson()), fileWriter, "  ", "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
