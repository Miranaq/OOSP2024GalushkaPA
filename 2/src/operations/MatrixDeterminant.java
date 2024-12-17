package operations;

import models.Matrix;

public class MatrixDeterminant {
    public double calculate(Matrix matrix) {
        if (matrix.getRows() != matrix.getCols()) {
            throw new IllegalArgumentException("Determinant can only be calculated for square matrices.");
        }

        return determinant(matrix.getData());
    }

    private double determinant(double[][] data) {
        int n = data.length;
        if (n == 1) {
            return data[0][0];
        }
        if (n == 2) {
            return data[0][0] * data[1][1] - data[0][1] * data[1][0];
        }

        double det = 0;
        for (int i = 0; i < n; i++) {
            det += (i % 2 == 0 ? 1 : -1) * data[0][i] * determinant(minor(data, 0, i));
        }
        return det;
    }

    private double[][] minor(double[][] data, int row, int col) {
        double[][] minor = new double[data.length - 1][data.length - 1];
        for (int i = 0, m = 0; i < data.length; i++) {
            for (int j = 0, n = 0; j < data.length; j++) {
                if (i != row && j != col) {
                    minor[m][n++] = data[i][j];
                    if (n == minor.length) {
                        n = 0;
                        m++;
                    }
                }
            }
        }
        return minor;
    }
}
