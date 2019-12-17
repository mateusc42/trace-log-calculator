package com.mateus.calculator.aspectj.business;
import com.mateus.calculator.aspectj.annotation.TraceLog;

public class Calculator {

    @TraceLog
    public static int add(int a, int b) {
        return a + b;
    }

    @TraceLog
    public static int sub(int a, int b) {
        return a - b;
    }

    @TraceLog
    public static int multiply(int a, int b) {
        return a * b;
    }

    @TraceLog
    public static int divide(int a, int b) {
        return a / b;
    }
}
