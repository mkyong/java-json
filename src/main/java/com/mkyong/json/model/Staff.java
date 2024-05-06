package com.mkyong.json.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

// @JsonInclude(JsonInclude.Include.NON_NULL)
public class Staff {
    private String name;
    private int age;
    private String[] position;              //  Array
    //@JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> skills;            //  List
    //@JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String, BigDecimal> salary; //  Map
    private boolean active;                 // boolean

    public Staff() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getPosition() {
        return position;
    }

    public void setPosition(String[] position) {
        this.position = position;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Map<String, BigDecimal> getSalary() {
        return salary;
    }

    public void setSalary(Map<String, BigDecimal> salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position=" + Arrays.toString(position) +
                ", skills=" + skills +
                ", salary=" + salary +
                ", active=" + active +
                '}';
    }
}
