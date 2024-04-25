package com.mkyong.json.jackson.subset;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class SubsetJsonExample {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        // Configure ObjectMapper to ignore unknown properties
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // Get file content from resources folder.
        try (InputStream inputStream = SubsetJsonExample.class.
                getClassLoader().getResourceAsStream("jackson/subset.json")) {

            ModelWrapper modelWrapper = mapper.readValue(inputStream, ModelWrapper.class);
            for (ModelWrapper.Activity activity : modelWrapper.getModel().getActivities()) {
                System.out.println("Activity Start: " + activity.getStart());
                System.out.println("Activity End: " + activity.getEnd());
                System.out.println("Activity Content: " + activity.getContent());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
