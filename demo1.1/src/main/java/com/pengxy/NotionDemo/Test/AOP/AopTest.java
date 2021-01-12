package com.pengxy.NotionDemo.Test.AOP;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
    @Test
    public void main(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfigTest.class);
        Chinease chinease = applicationContext.getBean("chinease",Chinease.class);
        chinease.name();
    }
}
