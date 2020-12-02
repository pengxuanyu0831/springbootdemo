package com.pengxy.demo.framewrok;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2020/12/02 22:04
 */
public abstract class father {
    /*
     模板设计模式
     1 有主流程方法life()
     2 有钩子方法love()
     */
    public void life(){
        eat();
        love();
        sleep();
    }

    public void eat(){
        System.out.println("人是铁，饭是钢，一顿不吃饿得慌");
    }

    public void sleep(){
        System.out.println("睡觉觉");
    }

    public abstract void love();
}
