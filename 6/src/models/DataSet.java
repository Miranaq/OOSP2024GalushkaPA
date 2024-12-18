package models;

import java.util.List;

public class DataSet {
    private List<Double> data;

    public DataSet(List<Double> data) {
        this.data = data;
    }

    public List<Double> getData() {
        return data;
    }

    public void setData(List<Double> data) {
        this.data = data;
    }
}
