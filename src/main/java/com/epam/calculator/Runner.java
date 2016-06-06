package com.epam.calculator;

import com.epam.calculator.operation.Operation;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        boolean repeat = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input a");
        double a;
        try {
            a = sc.nextDouble();
            while (repeat) {
                try {
                    System.out.println("Please, input kind of operation\n +\n -\n *\n /\n any: exit");
                    String operationString = sc.next();
                    Operation operation = OperationFactory.getInstance(operationString);
                    System.out.println("Please, input b");
                    double b = sc.nextDouble();
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
