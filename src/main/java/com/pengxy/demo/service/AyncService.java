package com.pengxy.demo.service;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AyncService {

    @Async
    public void helloworld(){
//        System.out.println("这是一个hello world命令");
        try{
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("======== this is a code ========");
    }
}
