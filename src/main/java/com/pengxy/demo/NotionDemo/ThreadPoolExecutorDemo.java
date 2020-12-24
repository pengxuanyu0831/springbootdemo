package com.pengxy.demo.NotionDemo;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorDemo {
    ExecutorService poolExecutor = Executors.newFixedThreadPool(4);
    poolExecutor.(new Runnable() {
        @Override
       public void run(){
           System.out.println("this is Asyn");
        }
    });
}
