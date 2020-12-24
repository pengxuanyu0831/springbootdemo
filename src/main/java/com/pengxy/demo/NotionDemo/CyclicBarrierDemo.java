package com.pengxy.demo.NotionDemo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2020/12/19 23:22
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier collect = new CyclicBarrier(7,()->{
            System.out.println("收集七颗龙珠完成，召唤神龙吧！");
        });
        for (int i = 1; i <= 7; i++){
            final int temple  = i ;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "已经收集到   第"+ temple + "颗龙珠!!");
                try{
                    collect.await();
                }catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
