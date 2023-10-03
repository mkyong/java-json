package com.mkyong.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.mkyong.json.model.Book;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Java8TimeApiSupportApp {

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper om = new ObjectMapper();

        // support Java 8 dates
        om.registerModule(new JavaTimeModule());

        // or like this
        // om.findAndRegisterModules();

        Book book =
                new Book(1L, "Book A",
                        BigDecimal.valueOf(9.99),
                        LocalDate.of(2023, 10, 1));

        // pretty print enabled
        String result = om.writerWithDefaultPrettyPrinter().writeValueAsString(book);

        System.out.println(result);

    }

}
