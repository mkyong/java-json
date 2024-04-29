package com.mkyong.json.jackson.treemodel;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonTreeModelExample2 {

    public static void main(String[] args) {

        try {

            ObjectMapper mapper = new ObjectMapper();

            JsonNode rootArray = mapper.readTree(new File("tree/user2.json"));

            for (JsonNode root : rootArray) {

                // Get id
                long id = root.path("id").asLong();
                System.out.println("id : " + id);

                // Get Name
                JsonNode nameNode = root.path("name");
                if (!nameNode.isMissingNode()) {        // if "name" node exists?
                    System.out.println("firstName : " + nameNode.path("first").asText());
                    System.out.println("middleName : " + nameNode.path("middle").asText());
                    System.out.println("lastName : " + nameNode.path("last").asText());
                }

                // Get Contact
                JsonNode contactNode = root.path("contact");
                if (contactNode.isArray()) {

                    System.out.println("Is this node an Array? " + contactNode.isArray());

                    for (JsonNode node : contactNode) {
                        String type = node.path("type").asText();
                        String ref = node.path("ref").asText();
                        System.out.println("type : " + type);
                        System.out.println("ref : " + ref);

                    }
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}