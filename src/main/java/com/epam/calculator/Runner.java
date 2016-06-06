package com.epam.calculator;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        boolean repeat = true;
        while (repeat)
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, input first number");
            int a = sc.nextInt();
            System.out.println("Please, input second number");
            int b = sc.nextInt();
            System.out.println("Please, input kind of operation\n 1: +\n 2: -\n 3: *\n 4: /\n 0: exit");
            int operation = sc.nextInt();
            if (operation == 0) throw new RuntimeException();
            System.out.println("Result:\n" + CalculatorFactory.getInstance(a, b, operation).getResult());
        } catch (RuntimeException e) {
            repeat = false;
        } catch (Exception e) {
            System.out.println("Something is going wrong...");
        }
    }
}
