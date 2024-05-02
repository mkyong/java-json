package com.mkyong.json.jackson.tips;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;
import java.time.LocalDate;

public class CustomSerializerExample {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();

        // Registering the custom serializer and deserializer
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());

        // Register the module with the ObjectMapper
        mapper.registerModule(module);

        // Example usage: Serialize and deserialize a LocalDate
        LocalDate date = LocalDate.of(2024, 5, 30);

        try {
            String serializedDate = mapper.writeValueAsString(date);
            System.out.println("Serialized date: " + serializedDate);

            LocalDate deserializedDate = mapper.readValue("\"2024-05-30\"", LocalDate.class);
            System.out.println("Deserialized date: " + deserializedDate);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
