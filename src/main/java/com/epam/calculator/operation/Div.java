package com.epam.calculator.operation;

public class Div implements Operation{
    @Override
    public double calculate(double a, double b) {
        return a / b;
    }
}
