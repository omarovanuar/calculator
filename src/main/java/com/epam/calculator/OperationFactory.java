package com.epam.calculator;

import com.epam.calculator.operation.*;

public class OperationFactory {

    public static Operation getInstance(String operationString) {
        Operation operation;
        char operationChar = operationString.charAt(0);
        switch (operationChar) {
            case '+':
                operation = new Sum();
                break;
            case '-':
                operation = new Sub();
                break;
            case '*':
                operation = new Mult();
                break;
            case '/':
                operation = new Div();
                break;
            default:
                operation = null;
                break;
        }
        return operation;
    }
}
