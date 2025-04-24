package com.sultan.spring.mvc_hibernate_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


@Component
@Aspect
public class myLoggingAspect {


    @Around("execution(* com.sultan.spring.mvc_hibernate_aop..*(..))")


    public Object aroundAllObjectAdvicece(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String methodName = methodSignature.getName();
        System.out.println("Begin of method: " + methodName);
        Object targetMethodRes = joinPoint.proceed();

        System.out.println("End of method: " + methodName);
        return targetMethodRes;

    }
}
