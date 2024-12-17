import factory.MatrixOperationFactory;
import factory.MatrixOperationFactoryImpl;
import models.Matrix;
import operations.MatrixAddition;
import operations.MatrixMultiplication;
import operations.MatrixDeterminant;

public class Main {
    public static void main(String[] args) {
        MatrixOperationFactory factory = new MatrixOperationFactoryImpl();

        Matrix a = new Matrix(new double[][]{{1, 2}, {3, 4}});
        Matrix b = new Matrix(new double[][]{{5, 6}, {7, 8}});

        // Сложение
        MatrixAddition addition = factory.createAddition();
        Matrix resultAdd = addition.add(a, b);
        System.out.println("Сложение:");
        printMatrix(resultAdd);

        // Умножение
        MatrixMultiplication multiplication = factory.createMultiplication();
        Matrix resultMul = multiplication.multiply(a, b);
        System.out.println("Умножение:");
        printMatrix(resultMul);

        // Определитель
        MatrixDeterminant determinant = factory.createDeterminant();
        double det = determinant.calculate(a);
        System.out.println("Определитель матрицы A: " + det);
    }

    private static void printMatrix(Matrix matrix) {
        for (double[] row : matrix.getData()) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
