package com.epam.calculator;

public class CalculatorFactory {

    public static Calculator getInstance(int a, int b, int operation) {
        return new Calculator(a , b ,operation);
    }
}
