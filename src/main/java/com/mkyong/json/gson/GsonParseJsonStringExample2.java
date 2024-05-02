package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.mkyong.json.gson.model.DataWrapper;
import com.mkyong.json.model.Person;

public class GsonParseJsonStringExample2 {


    public static void main(String[] args) {

        //String json = "{\"data\":[{\"id\":1000,\"name\":\"ABC\"},{\"id\":1001,\"name\":\"BCD\"},{\"id\":1002,\"name\":\"CDE\"}]}";

        String json = """
                {
                   "data": [
                     {"id": 1000, "name": "ABC"},
                     {"id": 1001, "name": "BCD"},
                     {"id": 1002, "name": "CDE"}
                   ]
                 }
                """;

        Gson gson = new Gson();

        DataWrapper data = gson.fromJson(json, DataWrapper.class);

        System.out.println(data);


    }
}
