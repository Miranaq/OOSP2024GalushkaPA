package operations;

import models.Matrix;

public class MatrixAddition {
    public Matrix add(Matrix a, Matrix b) {
        if (a.getRows() != b.getRows() || a.getCols() != b.getCols()) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
        }

        double[][] result = new double[a.getRows()][a.getCols()];

        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < a.getCols(); j++) {
                result[i][j] = a.getData()[i][j] + b.getData()[i][j];
            }
        }

        return new Matrix(result);
    }
}
