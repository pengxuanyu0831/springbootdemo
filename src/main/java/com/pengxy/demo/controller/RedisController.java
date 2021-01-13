package com.pengxy.demo.controller;

import com.pengxy.demo.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2021/01/13 22:00
 */


@RestController
public class RedisController {
    @Autowired
    private RedisService redisService;

    @GetMapping("/queryLeader")
    public String queryLeader(){
        long strar_time = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Runnable runnable = () ->{
            redisService.queryLeader();
        };

            for(int i = 1;i<100;i++){
                executorService.execute(runnable);
            }
            executorService.shutdown();
            long end_time;
            while (true){
                if (executorService.isTerminated()) {

                    end_time = System.currentTimeMillis() - strar_time;
                    break;
                }
            }
            return "查询耗时 " + end_time;
    }
}
