package com.mkyong.json.jsonsimple;

import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

public class JsonSimplePrettyPrintExample {

    public static void main(String[] args) throws JsonException {

        String json = "{\"name\": \"mkyong\", \"age\": 42}";

        JsonObject jsonObject = (JsonObject) Jsoner.deserialize(json);

        // pretty print
        String out = Jsoner.prettyPrint(jsonObject.toJson());

        // default, compact print
        // String out = jsonObject.toJson();

        System.out.println(out);

    }
}
