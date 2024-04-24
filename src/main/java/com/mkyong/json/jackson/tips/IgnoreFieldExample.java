package com.mkyong.json.jackson.tips;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkyong.json.model.SecretData;
import com.mkyong.json.model.User;

public class IgnoreFieldExample {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        User user = new User();
        user.setName("mkyong");
        user.setAge(42);
        user.setSecret(new SecretData("123", "sha256"));

        try {

            String jsonOutput = mapper.writeValueAsString(user);
            System.out.println(jsonOutput);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
