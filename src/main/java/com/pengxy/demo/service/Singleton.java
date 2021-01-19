package com.pengxy.demo.service;

public class Singleton {
    private static Singleton instance = null;
    // 创建私有方法，防止实例化
    private Singleton(){};

    public static Singleton getInstance() {
        if(instance == null){
            synchronized (instance){
                if(instance == null){
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }

    public synchronized static void asyncInit(){
        if(instance ==null){
            instance = new Singleton();
        }
    }
}
