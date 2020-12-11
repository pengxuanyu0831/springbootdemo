package com.pengxy.NotionDemo.Test;

import java.lang.ref.SoftReference;

/**
 * @program demo
 * @description: Thread Notion
 * @author: pengxuanyu
 * @create: 2020/12/10 22:24
 */
public class MyThread implements Runnable {
    public void run(){
        // TODO
        Object obj = new Object();
        SoftReference softReference = new SoftReference<>(obj);
        new Thread(()->{
            //TODO
        }).start();
    }

    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO
            }
        }).start();
    }
}
