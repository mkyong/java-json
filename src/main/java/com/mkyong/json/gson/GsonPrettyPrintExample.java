package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonPrettyPrintExample {

    public static void main(String[] args) {

        // Gson gson = new Gson();

        // Create a GsonBuilder and enable the pretty print
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String[] lang = {"Java", "Node", "Kotlin", "JavaScript"};

        String json = gson.toJson(lang);

        System.out.println(json);

    }
}
