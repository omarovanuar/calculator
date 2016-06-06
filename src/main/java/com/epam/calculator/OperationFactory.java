package com.epam.calculator;

import com.epam.calculator.operation.*;

public class OperationFactory {

    public static Operation getInstance(int operationInt) {
        Operation operation;
        switch (operationInt) {
            case 1:
                operation = new Sum();
                break;
            case 2:
                operation = new Sub();
                break;
            case 3:
                operation = new Mult();
                break;
            case 4:
                operation = new Div();
                break;
            case 0:
                throw new RuntimeException();
            default:
                throw new RuntimeException();
        }
        return operation;
    }
}
