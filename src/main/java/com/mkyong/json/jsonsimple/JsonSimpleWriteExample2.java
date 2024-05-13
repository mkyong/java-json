package com.mkyong.json.jsonsimple;

import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.mkyong.json.jsonsimple.model.Person;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class JsonSimpleWriteExample2 {

    public static void main(String[] args) {

        // this object need implements Jsonable interface
        Person person = new Person();
        person.setName("mkyong");
        person.setAge(42);

        List<String> list = new ArrayList<>();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");

        person.setMessages(list);

        try (FileWriter fileWriter = new FileWriter("person.json")) {

            // convert object to json and write to file
            Jsoner.serialize(person, fileWriter);

            // pretty print, need catch JsonException
            // Jsoner.prettyPrint(new StringReader(Jsoner.serialize(person)), fileWriter, "  ", "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
