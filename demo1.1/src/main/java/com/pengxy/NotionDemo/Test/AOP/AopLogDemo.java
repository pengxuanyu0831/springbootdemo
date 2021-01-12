package com.pengxy.NotionDemo.Test.AOP;



import org.apache.logging.log4j.LogManager;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.apache.logging.log4j.Logger;


/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2021/01/07 22:16
 */


@Aspect
@Component
public class AopLogDemo {

    Class clazz;
    private final static Logger logger = LogManager.getLogger(AopLogDemo.class);


    @Pointcut("execution(* com.pengxy.NotionDemo.Test.AOP..*(..))")
    public void printLog(){
    }

    @Before("printLog()")
    public void beforExecute(){
        logger.info("+++++++++++++++++前置通知开始++++++++++++++++");
    }
}
