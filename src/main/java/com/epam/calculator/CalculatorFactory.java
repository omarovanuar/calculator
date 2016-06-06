package com.epam.calculator;

public class CalculatorFactory {
    private static Calculator calculator;

    private CalculatorFactory(int a, int b, int operation) {
        calculator = new Calculator(a , b ,operation);
    }

    public static Calculator getInstance(int a, int b, int operation) {
        new CalculatorFactory(a, b, operation);
        return calculator;
    }

}
