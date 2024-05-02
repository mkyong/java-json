package com.mkyong.json.gson.model;

import java.util.List;

public class DataWrapper {

    List<DataItem> data;

    public List<DataItem> getData() {
        return data;
    }

    public void setData(List<DataItem> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataWrapper{" +
                "data=" + data +
                '}';
    }
}
