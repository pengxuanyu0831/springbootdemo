package com.pengxy.demo.NotionDemo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2020/12/19 21:36
 */
public class CoundownLatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch begin = new CountDownLatch(1);
        CountDownLatch end = new CountDownLatch(8);
        ThreadPoolExecutor runner = (ThreadPoolExecutor) Executors.newFixedThreadPool(8);
        for(int index = 1;index < 8 ;index++){
            final int No = index + 1 ;
            // int finalIndex = index;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        begin.await();
                        Thread.sleep((long)(Math.random() * 1000));
                        System.out.println(Thread.currentThread().getName()  + " No " + No + " 号选手到达终点！");
                    } catch (InterruptedException e){
                    } finally {
                        end.countDown();
                    }
                }
            }).start();
        }
        System.out.println("比赛开始！");
        begin.countDown();
        end.await();
        System.out.println("比赛结束");
        runner.shutdown();
    }
}
