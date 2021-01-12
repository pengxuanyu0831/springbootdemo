package com.pengxy.NotionDemo.Test.AOP;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Location {
    @Pointcut("execution(* com.pengxy.NotionDemo.Test.AOP.Chinease(..))")
    public void PeoplePointCut(){}


    @After("PeoplePointCut()")
    public void peopleInGD(){
        System.out.println("广东人");
    }
}
