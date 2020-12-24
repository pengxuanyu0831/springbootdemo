package com.pengxy.demo.NotionDemo;


import java.util.concurrent.*;

public class ThreadPoolExecutorDemo {

    public static void main(String[] args) {
        // ExecutorService executorService = Executors.newFixedThreadPool(7);
        ExecutorService executorService = new ThreadPoolExecutor(5,
                10,100, TimeUnit.SECONDS,new LinkedBlockingQueue<>());
        Runnable runnable = () ->{
            try{
                // TimeUnit.MINUTES.sleep(100);
                System.out.println("lbwnb");
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        executorService.execute(runnable);
        executorService.shutdown();
    }






}
