package com.mateus.calculator.aspectj.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
public class TraceLogAspect {

    @Around("com.mateus.calculator.aspectj.pointcut.TraceLogPointcut.traceLog()")
    public Object aroundMethodCall(ProceedingJoinPoint joinPoint)
        throws Throwable {
        Method method =
            ((MethodSignature) joinPoint.getSignature()).getMethod();
        String methodName = method.getName();
        String parameters = Arrays.toString(joinPoint.getArgs());
        System.out.println("Calling " + methodName + "(" + parameters + ")");
        Object returnValue;
        try {
            returnValue = joinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println("Method call "
                + methodName + "(" + parameters + ") throws: " + throwable);
            throw throwable;
        }
        System.out.println("Method call "
            + methodName + "(" + parameters + ") returns: " + returnValue);
        return returnValue;
    }
}
