package com.pengxy.demo.redis;
import org.redisson.*;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

import java.io.File;
import java.io.IOException;

public class RedissionClientDemo {
    public static void main(String[] args) throws IOException {
        task(5);
    }

    public static void task(int count) throws IOException {
         Config config = new Config();
         // config = Config.fromYAML(new File(""));
         config.useSingleServer().setAddress("redis://127.0.0.1:6379");
         RedissonClient client = Redisson.create(config);
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
