package com.pengxy.NotionDemo.Test.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.apache.log4j.Logger;
/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2021/01/07 22:16
 */


@Aspect
@Component
public class AopLogDemo {

    private final static  Logger logger = Logger.getLogger(AopLogDemo.class);


    @Pointcut("execution(* com.pengxy.NotionDemo.Test.AOP..*(..))")
    public void printLog(){
    }

    @Before("printLog()")
    public void beforExecute(){
        logger.info("+++++++++++++++++前置通知开始++++++++++++++++");
    }
}
