package com.epam.calculator;

import com.epam.calculator.operation.Operation;

public class Runner {
    public static void main(String[] args) {
        boolean repeat = true;
        double a;
        try {
            a = Double.valueOf(InputUtil.read("Please, input a"));
            while (repeat) {
                try {
                    String operationString = InputUtil.read("Please, input kind of operation\n +\n -\n *\n /\n any: exit");
                    Operation operation = OperationFactory.getInstance(operationString);
                    double b = Double.valueOf(InputUtil.read("Please, input b"));
                    double result = operation.calculate(a, b);
                    System.out.println("Result:\n" + result + "\n");
                    a = result;
                } catch (RuntimeException e) {
                    repeat = false;
                }
            }
        } catch (Exception e) {
            System.out.println("Something is going wrong...");
        }
    }
}
