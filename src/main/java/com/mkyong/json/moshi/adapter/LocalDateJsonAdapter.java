package com.mkyong.json.moshi.adapter;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateJsonAdapter {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE;

    @ToJson
    String toJson(LocalDate date) {
        return date.format(FORMATTER); // Serialize the LocalDate to String
    }

    @FromJson
    LocalDate fromJson(String date) {
        return LocalDate.parse(date, FORMATTER); // Parse the String back to a LocalDate
    }

}
