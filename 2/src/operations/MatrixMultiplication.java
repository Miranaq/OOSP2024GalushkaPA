package operations;

import models.Matrix;

public class MatrixMultiplication {
    public Matrix multiply(Matrix a, Matrix b) {
        if (a.getCols() != b.getRows()) {
            throw new IllegalArgumentException("Invalid matrix dimensions for multiplication.");
        }

        double[][] result = new double[a.getRows()][b.getCols()];

        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < b.getCols(); j++) {
                for (int k = 0; k < a.getCols(); k++) {
                    result[i][j] += a.getData()[i][k] * b.getData()[k][j];
                }
            }
        }

        return new Matrix(result);
    }
}
