package com.pengxy.demo.service;

/**
 * @program demo
 * @description: 懒汉式单例
 * @author: pengxuanyu
 * @create: 2021/01/19 20:38
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    public LazySingleton() {
    }

    public static LazySingleton getLazySingleton(){
        if(null == lazySingleton){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
