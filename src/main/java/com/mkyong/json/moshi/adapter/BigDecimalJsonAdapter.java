package com.mkyong.json.moshi.adapter;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;

import java.math.BigDecimal;

public class BigDecimalJsonAdapter {

    @ToJson
    String toJson(BigDecimal value) {
        return value.toString(); // Converts BigDecimal to its string representation
    }

    @FromJson
    BigDecimal fromJson(String value) {
        return new BigDecimal(value); // Constructs a BigDecimal from the string representation
    }
}
