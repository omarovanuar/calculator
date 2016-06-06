package com.epam.calculator.operation;

public class Sum implements Operation{
    @Override
    public double operate(double a, double b) {
        return a + b;
    }
}
