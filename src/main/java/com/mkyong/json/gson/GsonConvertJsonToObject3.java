package com.mkyong.json.gson;

import com.google.gson.*;
import com.mkyong.json.model.Staff;

public class GsonConvertJsonToObject3 {

    public static void main(String[] args) {

        Gson gson = new Gson();

        String json = "{\"name\":\"mkyong\",\"age\":42,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000},\"active\":true}";

        // Converts JSON to JsonElement
        JsonElement element = gson.fromJson(json, JsonElement.class);

        if (element.isJsonObject()) {
            JsonObject obj = element.getAsJsonObject();
            // remove position and salary
            obj.remove("position");
            obj.remove("salary");

            // add or update age
            obj.addProperty("age", 99);

            // add a JsonArray
            JsonArray jsonArray = new JsonArray();
            jsonArray.add("spring boot");
            jsonArray.add("javascript");
            obj.add("skills", jsonArray);
        }

        // Converts JsonElement to Java object
        Staff staff = gson.fromJson(element, Staff.class);

        System.out.println(staff);

    }

}
