package com.epam.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private int operation;
    private double result;


    public Calculator(int firstNumber, int secondNumber, int operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
        calculate();
    }

    public void calculate() {
        switch (operation) {
            case 1:
                result = this.sum();
                break;
            case 2:
                result = this.sub();
                break;
            case 3:
                result = this.multiply();
                break;
            case 4:
                result = this.divide();
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

    public Double getResult() {
        return result;
    }
}
