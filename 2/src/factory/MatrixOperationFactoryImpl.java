package factory;

import operations.MatrixAddition;
import operations.MatrixMultiplication;
import operations.MatrixDeterminant;

public class MatrixOperationFactoryImpl implements MatrixOperationFactory {
    @Override
    public MatrixAddition createAddition() {
        return new MatrixAddition();
    }

    @Override
    public MatrixMultiplication createMultiplication() {
        return new MatrixMultiplication();
    }

    @Override
    public MatrixDeterminant createDeterminant() {
        return new MatrixDeterminant();
    }
}
