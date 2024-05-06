package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.mkyong.json.model.Person;

import java.lang.reflect.Type;
import java.util.List;

public class GsonConvertJsonToObject4 {

    public static void main(String[] args) {

        Gson gson = new Gson();

        String json = """
                {
                   "company":"hello world",
                   "data": [
                     {"age": 10, "name": "AAA"},
                     {"age": 20, "name": "BBB"},
                     {"age": 30, "name": "CCC"}
                   ]
                 }
                """;

        // Converts JSON to JsonElement
        JsonElement element = gson.fromJson(json, JsonElement.class);

        if (element.isJsonObject()) {

            JsonObject obj = element.getAsJsonObject();

            // Get the `data` array
            JsonArray data = obj.getAsJsonArray("data");

            // creates a List<Person>
            Type personListType = new TypeToken<List<Person>>() {}.getType();

            // converts the array to List<Person>
            List<Person> list = gson.fromJson(data, personListType);

            for (Person person : list) {
                System.out.println(person);
            }

        }

    }

}
