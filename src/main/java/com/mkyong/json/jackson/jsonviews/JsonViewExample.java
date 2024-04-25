package com.mkyong.json.jackson.jsonviews;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JsonViewExample {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        Staff staff = createStaff();

        try {

            // to enable pretty print
            mapper.enable(SerializationFeature.INDENT_OUTPUT);

            // normal
            String normalView = mapper
                    .writerWithView(ViewCompany.Normal.class)
                    .writeValueAsString(staff);

            System.out.format("\nNormal view\n%s\n", normalView);

            // manager
            String managerView = mapper
                    .writerWithView(ViewCompany.Manager.class)
                    .writeValueAsString(staff);

            System.out.format("\nManager view\n%s\n", managerView);

            // hr
            String hrView = mapper
                    .writerWithView(ViewCompany.HR.class)
                    .writeValueAsString(staff);

            System.out.format("\nHR view\n%s\n", hrView);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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
