package com.mkyong.json.moshi;

import com.mkyong.json.model.Book;
import com.mkyong.json.moshi.adapter.BigDecimalJsonAdapter;
import com.mkyong.json.moshi.adapter.LocalDateJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MoshiJava8DateTimeExample {

    public static void main(String[] args) {

        Moshi moshi = new Moshi.Builder()
                .add(new BigDecimalJsonAdapter()) // Register the BigDecimal adapter
                .add(new LocalDateJsonAdapter()) // Register the LocalDate adapter
                .build();

        JsonAdapter<Book> jsonAdapter = moshi.adapter(Book.class);

        Book book =
                new Book(1L, "Book A",
                        BigDecimal.valueOf(9.99),
                        LocalDate.of(2023, 10, 1));

        try {

            String json = jsonAdapter.toJson(book);
            System.out.println(json);

        } catch (Exception e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
        }

    }
}
