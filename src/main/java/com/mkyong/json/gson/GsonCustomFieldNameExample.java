package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.mkyong.json.model.Person;

public class GsonCustomFieldNameExample {

    public static void main(String[] args) {

        String json = "{\"nick_name\":\"mkyong\",\"age\":42}";

        Gson gson = new Gson();

        // Deserialize JSON to Java object
        Person person = gson.fromJson(json, Person.class);

        // Serialize Java object back to JSON
        System.out.println(person);

        String newJson = gson.toJson(person);

        System.out.println("Serialized JSON: " + newJson);

    }

}
