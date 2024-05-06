package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mkyong.json.model.Person;
import com.mkyong.json.model.Staff;

public class GsonConvertJsonToObject2 {

    public static void main(String[] args) {

        // enable pretty print
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = "{\"name\":\"mkyong\",\"age\":42,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000},\"active\":true}";

        // Converts JSON to Java objecto
        Staff staff = gson.fromJson(json, Staff.class);

        System.out.println(staff);

    }

}
