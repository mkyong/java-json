package com.mkyong.json.gson.model;

import java.util.Arrays;
import java.util.List;

public class Item {

    private int id;
    private String name;

    private List<String>[] types;

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", types=" + Arrays.toString(types) +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String>[] getTypes() {
        return types;
    }

    public void setTypes(List<String>[] types) {
        this.types = types;
    }
}
