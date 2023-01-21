package com.kodilla;

public class CalculatorProgram {

    int a;
    int b;

    public int addition(int a, int b) {
        return a+b;
    }

    public int subtraction(int a, int b) {
        return a-b;
    }

    public int multiplication(int a, int b) {
        return a*b;
    }

    public int division(int a, int b) {
        return a/b;
    }
    public static void main(String[] args) {
        CalculatorProgram calculator = new CalculatorProgram();
        System.out.println("Result is " + calculator.addition(7,3));
    }
}