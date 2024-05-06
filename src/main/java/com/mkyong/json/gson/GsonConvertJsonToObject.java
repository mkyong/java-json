package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mkyong.json.model.Staff;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class GsonConvertJsonToObject {

    public static void main(String[] args) {

        Gson gson = new Gson();

        try (Reader reader = new FileReader("staff.json")) {

            // Convert JSON File to Java Object
            Staff staff = gson.fromJson(reader, Staff.class);

            // print staff object
            System.out.println(staff);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
