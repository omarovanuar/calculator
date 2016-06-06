package com.epam.calculator;

import com.epam.calculator.operation.Operation;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        double a;
        try {
            System.out.println("Please, input a");
            a = scanner.nextDouble();
            while (repeat) {
                System.out.println("Please, input kind of operation\n +\n -\n *\n /\n any: exit");
                String operationString = scanner.next();
                Operation operation = OperationFactory.getInstance(operationString);
                if (operation == null) break;
                System.out.println("Please, input b");
                double b = scanner.nextDouble();
                double result = operation.calculate(a, b);
                System.out.println("Result:\n" + result + "\n");
                a = result;
            }
        } catch (Exception e) {
            System.out.println("Something is going wrong...");
        }
    }
}
