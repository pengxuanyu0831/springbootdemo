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
                for(int i = 0;i <10 ;i++){
                    System.out.println("lbwnb");
                    System.out.println(Thread.currentThread().getName());
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        executorService.execute(runnable);
        executorService.shutdown();
    }






}
