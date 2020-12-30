package com.pengxy.demo.NotionDemo.CircularDemo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2020/12/30 16:37
 */
public class CircularServiceA {
    public CircularServiceA(){
        System.out.println("++++CircularServicA++++");
    }
    @Autowired
    private CircularServiceB circularServiceB;
}
