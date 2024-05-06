package com.mkyong.json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mkyong.json.model.Staff;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GsonConvertObjectToJson {

    public static void main(String[] args) {

        // default
        Gson gson = new Gson();

        // enable pretty print
        // Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // create a staff object for testing
        Staff staff = createStaffObject();

        // Converts Java object to String
        String json = gson.toJson(staff);
        System.out.println(json);

        // Converts Java object to File
        try (Writer writer = new FileWriter("staff.json")) {
            gson.toJson(staff, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static Staff createStaffObject() {

        Staff staff = new Staff();

        staff.setName("mkyong");
        staff.setAge(42);
        staff.setPosition(new String[]{"Founder", "CTO", "Writer"});

        Map<String, BigDecimal> salary = new HashMap<>();
        salary.put("2010", new BigDecimal(10000));
        salary.put("2012", new BigDecimal(12000));
        salary.put("2018", new BigDecimal(14000));
        staff.setSalary(salary);

        staff.setSalary(salary);
        staff.setSkills(Arrays.asList("java", "python", "node", "kotlin"));
        staff.setActive(true);

        return staff;

    }

}
