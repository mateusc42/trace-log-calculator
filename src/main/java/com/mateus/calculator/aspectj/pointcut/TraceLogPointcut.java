package com.mateus.calculator.aspectj.pointcut;
import org.aspectj.lang.annotation.Pointcut;

public class TraceLogPointcut {

    @Pointcut("execution(@com.mateus.calculator.aspectj.annotation.TraceLog * *(..))")
    public void traceLog() {
    }
}
