package com.pengxy.demo.redis;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program demo
 * @description: redis demo1,扣减库存
 * @author: pengxuanyu
 * @create: 2020/11/22 14:00
 */
public class RedisLockDemo {
    private static  Integer inventory = 1001;
    private static int NUM = 1000;
    private static LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
    static ReentrantLock rLock = new ReentrantLock();

    public static void main(String[] args) {
        // TimeUnit unit;
        ThreadPoolExecutor pool =
                new ThreadPoolExecutor(inventory, inventory, 10L, TimeUnit.SECONDS, linkedBlockingQueue);
        CountDownLatch latch =new CountDownLatch(NUM);
        long startTime = System.currentTimeMillis();
        for(int i = 0 ; i <= NUM ;i++) {
            pool.execute(new Runnable() {
                //  @Override
                public void run() {
                    rLock.lock();
                    inventory--;
                    System.out.println("线程 " + Thread.currentThread().getName());
                    rLock.unlock();
                    latch.countDown();
                }
            });
        }
        pool.shutdown();
        try{
            latch.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("共计耗时"+(endTime - startTime)+ "毫秒 ，"+"执行线程数为："+NUM+  "，此时库存数为"+ inventory);
    }
}
