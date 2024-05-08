package com.mkyong.json.gson.java8date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mkyong.json.model.Book;

import java.math.BigDecimal;
import java.time.LocalDate;

public class GsonJava8TimeExample {

    public static void main(String[] args) {

        Gson gson = new GsonBuilder()
                // register custom JsonSerializer for LocalDate
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .create();

        Book book =
                new Book(1L, "Book A",
                        BigDecimal.valueOf(9.99),
                        LocalDate.of(2023, 10, 1));

        String json = gson.toJson(book); // Serialize
        System.out.println("Serialized book: " + json);

        Book newBook = gson.fromJson(json, Book.class);// Deserialize
        System.out.println("Deserialized book: " + newBook);


    }
}
