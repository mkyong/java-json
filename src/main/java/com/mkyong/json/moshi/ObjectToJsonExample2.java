package com.mkyong.json.moshi;

import com.mkyong.json.model.Staff;
import com.mkyong.json.moshi.adapter.BigDecimalJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ObjectToJsonExample2 {

    public static void main(String[] args) {

        Moshi moshi = new Moshi.Builder()
                .add(new BigDecimalJsonAdapter()) // Register the BigDecimal adapter
                .build();
        JsonAdapter<Staff> jsonAdapter = moshi.adapter(Staff.class).indent("  ");

        Staff staff = createStaff();

        try {

            String json = jsonAdapter.toJson(staff);
            System.out.println(json);

        } catch (Exception e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
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
