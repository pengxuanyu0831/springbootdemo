package com.pengxy.NotionDemo.Test.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2021/01/02 19:52
 */

@Component
@Aspect
public class AspectJDemo {
    @Pointcut("execution(public * com.pengxy.*.*(..))")
    public void pc1(){}


    @Around("pc1()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("====前置通知===");
        Object result = joinPoint.proceed();
        System.out.println("====后置通知===");
        return result;
    }
}
