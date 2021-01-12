package com.pengxy.NotionDemo.Test.AOP;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AopConfigTest {
    @Bean
    public Location location(){
        return new Location();
    }

    @Bean
    public Chinease chinease(){
        return new Chinease();
    }
}
