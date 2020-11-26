package com.pengxy.demo.redis;
import org.redisson.*;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;

public class RedissionClientDemo {
    public static void main(String[] args) {
        task(5);
    }

    public static void task(int count){
         RedissonClient client = Redisson.create();
         RLock rLock = client.getLock("Test");
         rLock.lock();
         try{
             if(count <= 0){
                 return;
             }
             System.out.println("Run...."+ count);
             task(--count);
         }finally {
             rLock.unlock();
             System.out.println("Unlock..");
         }

    }
}
