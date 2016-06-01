package com.epam.calculator;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, input first number");
            int a = sc.nextInt();
            System.out.println("Please, input second number");
            int b = sc.nextInt();
            System.out.println("Please, input kind of operation\n 1: +\n 2: -\n 3: *\n 4: /");
            Calculator calculator = new Calculator(a, b);
            int operation = sc.nextInt();
            calculator.calculate(operation);
        } catch (Exception e) {
            System.out.println("Something is going wrong...");
        }
    }
}
