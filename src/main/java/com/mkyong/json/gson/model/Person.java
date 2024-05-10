package com.mkyong.json.gson.model;

import com.google.gson.annotations.Expose;
import com.mkyong.json.gson.exclude.GsonExcludeField;

public class Person {

    // @Expose default is @Expose(serialize = true, deserialize = true)
    @Expose
    private int id;

    @Expose(serialize = true, deserialize = true)
    private String name;

    // not annotated, same as @Expose(serialize = false, deserialize = false)
    // this field will exclude if excludeFieldsWithoutExposeAnnotation() is enabled
    private String password;

    //private transient String password;  // This field will not be serialized

    public Person(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
