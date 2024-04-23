package com.mkyong.json.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkyong.json.model.Staff;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConvertJavaObjectToJsonExample {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static void main(String[] args) throws IOException {

        Staff staff = createStaff();

        // Java object to JSON file
        // MAPPER.writeValue(new File("output.json"), staff);

        // Java object to JSON file with pretty print
        MAPPER.writerWithDefaultPrettyPrinter()
                .writeValue(new File("output.json"), staff);

        // convert Java object to JSON string - default compact-print
        String jsonString = MAPPER.writeValueAsString(staff);

        System.out.println(jsonString);

        // convert Java object to JSON string - with json pretty-print
        String jsonStringPrettyPrint = MAPPER
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(staff);

        System.out.println(jsonStringPrettyPrint);

    }

    private static Staff createStaff() {

        Staff staff = new Staff();

        staff.setName("mkyong");
        staff.setAge(42);
        staff.setPosition(new String[]{"Founder", "CTO", "Writer", "Minimalists"});

        Map<String, BigDecimal> salary = new HashMap<>();
        salary.put("2010", new BigDecimal(10000));
        salary.put("2012", new BigDecimal(12000));
        salary.put("2018", new BigDecimal(14000));
        staff.setSalary(salary);

        staff.setSkills(Arrays.asList("java", "python", "node", "kotlin"));

        return staff;

    }

}
