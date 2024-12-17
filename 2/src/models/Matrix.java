package models;

public class Matrix {
    private final double[][] data;

    public Matrix(double[][] data) {
        this.data = data;
    }

    public double[][] getData() {
        return data;
    }

    public int getRows() {
        return data.length;
    }

    public int getCols() {
        return data[0].length;
    }
}
