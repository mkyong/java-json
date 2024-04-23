package com.mkyong.json;

public class App {

    public static void main(String[] args) {

        // basic JSON example
        String jsonString = """
                {
                  "name": "mkyong"
                }
                """;

        String jsonStringDetail = """
                {
                  "name": "mkyong",
                  "age": 42
                  "skills": ["react", "python"],
                  "active": true
                }
                """;

        String jsonArray = """
                [
                   {
                      "name": "mkyong",
                      "age": 42
                   },
                   {
                      "name": "ahpig",
                      "age": 36
                   },
                   {
                     "name": "ahdog",
                     "age": 20
                   }
                 ]
                """;

        System.out.println(jsonString);
        System.out.println(jsonStringDetail);
        System.out.println(jsonArray);

    }
}
