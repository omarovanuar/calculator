package com.epam.calculator;

import java.util.Scanner;

public class InputUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static String read(String text) {
        System.out.println(text);
        return scanner.next();
    }
}
