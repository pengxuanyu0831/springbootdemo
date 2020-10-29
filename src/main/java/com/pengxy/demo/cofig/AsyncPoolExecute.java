package com.pengxy.demo.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class AsyncPoolExecute {
    @Bean
    public ThreadPoolTaskExecutor threadPoolExecutor(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(50);
        taskExecutor.setMaxPoolSize(120);
        taskExecutor.setQueueCapacity(26);
        taskExecutor.setKeepAliveSeconds(30);
        return taskExecutor;
    }
}
