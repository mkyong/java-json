package com.mkyong.json.jackson.treemodel;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JacksonTreeModelExample1 {

    public static void main(String[] args) {

        String json = """
                {
                  "id": 1,
                  "name": {
                    "first": "Yong",
                    "last": "Mook Kim"
                  },
                  "contact": [
                    {
                      "type": "phone/home",
                      "ref": "111-111-1234"
                    },
                    {
                      "type": "phone/work",
                      "ref": "222-222-2222"
                    }
                  ]
                }
                """;
        try {

            ObjectMapper mapper = new ObjectMapper();

            // read from a json file
            //JsonNode root = mapper.readTree(new File("tree/user.json"));

            // read from a json string
            JsonNode root = mapper.readTree(json);

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

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
