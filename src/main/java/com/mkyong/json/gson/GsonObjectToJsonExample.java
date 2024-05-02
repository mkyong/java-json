package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.mkyong.json.model.Person;

public class GsonObjectToJsonExample {

    public static void main(String[] args) {

        Person person = new Person("mkyong", 42);

        Gson gson = new Gson();

        // Java object to json
        String json = gson.toJson(person);

        //{"name":"mkyong","age":42}
        System.out.println(json);

        // json to Java object
        Person newPerson = gson.fromJson(json, Person.class);

        //Person{name='mkyong', age=42}
        System.out.println(newPerson);

    }
}
