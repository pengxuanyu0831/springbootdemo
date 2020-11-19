/*
「请寻求最优解，不要简单的synchronized」
请用两个线程交替输出A1B2C3D4...，A线程输出字母，B线程输出数字，要求A线程首先执行，B线程其次执行！
（多种同步机制的运用）
 */



package com.pengxy.demo.service;

import jdk.nashorn.internal.runtime.JSONFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static java.util.Arrays.asList;

public class OtherClass {
    public static final List<String> list = asList("A","1","B","2","C","3","D","4");
    public static void main(String[] args) {
        // A 线程打印字母
        // 匿名内部类创建线程，将Runnable作为对象传递给Thread
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (list){
                    for(int i = 0;i <list.size();i+=2){
                        System.out.println("线程 " + Thread.currentThread().getName() +" 的打印结果："+ list.get(i));
                        list.notify();
                        try{
                            list.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        },"A");

    // B 线程打印数字
        Thread B = new Thread(new Runnable(){
            @Override
            public void run(){
                synchronized (list){
                    for(int i = 1;i < list.size();i+=2){
                        System.out.println("线程 " + Thread.currentThread().getName() +" 的打印结果："+ list.get(i));
                        list.notify();
                        try{
                            list.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        },"B");
        A.start();
        B.start();
//        new Thread(){
//            @Override
//            public void  run(){
//                //List list = Lists.newArrary()
//                synchronized (list){
//                    for(int i = 1 ;i< list.size()+1;i+=3){
//                        System.out.println("线程 " + Thread.currentThread().getName() +" 的打印结果："+ i);
//                        list.notify();
//                    }try{
//                        list.wait();
//                    }catch (InterruptedException e){
//                        e.printStackTrace();
//                    }
//                }
//
//
//            };
//        }.start();
    }
}
