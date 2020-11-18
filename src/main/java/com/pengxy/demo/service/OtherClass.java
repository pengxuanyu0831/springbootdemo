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
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run(){
                for(int i = 1 ;i<4;i++){
                    System.out.println(i);

                }

            };
        }.start();

        new Thread(){
            @Override
            public void  run(){
                //List list = Lists.newArrary()
                List<String> list = asList("A","B","C","D");
                for(int i = 0 ;i<list.size();i++){
                    System.out.println(list.get(i));
                }
            };
        }.start();
    }
}
