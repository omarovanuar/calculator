package com.epam.calculator;

import com.epam.calculator.operation.Operation;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int counter = 1;
        boolean repeat = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input " + counter + " number");
        Double a = sc.nextDouble();
        while (repeat)
        try {
            System.out.println("Please, input kind of operation\n 1: +\n 2: -\n 3: *\n 4: /\n 0: exit");
            int operationInt = sc.nextInt();
            Operation operation = OperationFactory.getInstance(operationInt);
            counter++;
            System.out.println("Please, input " + counter + " number");
            Double b = sc.nextDouble();
            double result = operation.operate(a, b);
            System.out.println("Result:\n" + result + "\n");
            a = result;
        } catch (RuntimeException e) {
            repeat = false;
        } catch (Exception e) {
            System.out.println("Something is going wrong...");
        }
    }
}
