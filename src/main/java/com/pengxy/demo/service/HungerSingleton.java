package com.pengxy.demo.service;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2021/01/19 20:44
 */
public class HungerSingleton {
    private static HungerSingleton hungerSingleton = new HungerSingleton();￿

    private HungerSingleton() {}

    public static HungerSingleton getHungerSingleton() {
        return hungerSingleton;
    }
}
