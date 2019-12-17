package com.mateus.calculator.aspectj.main;
import com.mateus.calculator.aspectj.business.Calculator;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        int sum = Calculator.add(17, 20);
        System.out.println("SUM: " + sum);
        System.out.println();

        int sub = Calculator.sub(14, 7);
        System.out.println("SUB: " + sub);
        System.out.println();

        int mult = Calculator.multiply(3, 6);
        System.out.println("MULTIPLY: " + mult);
        System.out.println();

        int div = Calculator.divide(25, 5);
        System.out.println("DIVIDE: " + div);
        System.out.println();

        System.out.println("ERROR SIMULATING");
        try {
            int quotient = Calculator.divide(42, 0);
            System.out.println("RESULT DIVIDE: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("EXCEPTION: " + e);
        }

        System.out.println();
    }
}
