package com.pengxy.demo.service;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;


public class ClassLoad {
    public static void main (String[] args)throws IOException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println("系统类加载器 :" + classLoader);
        Enumeration<URL> emu = classLoader.getResources(" ");
        while(emu.hasMoreElements()){
            System.out.println(emu.nextElement());
        }
        // 父加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println("扩展类加载器 :" + parent);
        System.out.println("加载路径 :" + System.getProperty("java.exe.dirs"));
        System.out.println("扩展类加载器的父类加载器 :" + parent.getParent());
    }
}
