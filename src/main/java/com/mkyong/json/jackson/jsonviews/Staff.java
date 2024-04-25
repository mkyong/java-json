package com.mkyong.json.jackson.jsonviews;

import com.fasterxml.jackson.annotation.JsonView;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Staff {

    @JsonView(ViewCompany.Normal.class)
    private String name;

    @JsonView(ViewCompany.Normal.class)
    private int age;

    // two views
    @JsonView({ViewCompany.HR.class, ViewCompany.Manager.class})
    private String[] position;              //  Array

    @JsonView(ViewCompany.Manager.class)
    private List<String> skills;            //  List

    @JsonView(ViewCompany.HR.class)
    private Map<String, BigDecimal> salary; //  Map

    @JsonView(ViewCompany.Normal.class)
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
