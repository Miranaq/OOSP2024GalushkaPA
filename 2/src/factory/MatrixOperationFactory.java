package factory;

import operations.MatrixAddition;
import operations.MatrixMultiplication;
import operations.MatrixDeterminant;

public interface MatrixOperationFactory {
    MatrixAddition createAddition();
    MatrixMultiplication createMultiplication();
    MatrixDeterminant createDeterminant();
}
