package com.epam.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;


    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void calculate(int operation) {
        System.out.println("And the result is:");
        switch (operation) {
            case 1:
                System.out.print(this.sum());
                break;
            case 2:
                System.out.print(this.sub());
                break;
            case 3:
                System.out.print(this.multiply());
                break;
            case 4:
                System.out.print(this.divide());
                break;
            default:
                System.out.println("Unknown operation");
                break;
        }
    }

    private int sum() {
        return this.firstNumber + this.secondNumber;
    }

    private int sub() {
        return this.firstNumber - this.secondNumber;
    }

    private int multiply() {
        return this.firstNumber * this.secondNumber;
    }

    private double divide() {
        return (double) this.firstNumber / this.secondNumber;
    }
}
