package com.pengxy.demo.DecoratorPattern;

/**
 * @program demo
 * @description: 继承装饰者类
 * @author: pengxuanyu
 * @create: 2020/12/05 11:26
 */
public class Hyxz2013 extends Decorator {
    public Hyxz2013(House house) {
        super(house);
    }
    public void addComputer(){
        Hyxz1501 hyxz1501 = (Hyxz1501)house;
        hyxz1501.getHumanbeings().add("新电脑");
        System.out.println("2013年家里买了新电脑!");
    }

    @Override
    public void goods() {
        // 旧东西还在
        super.goods();
        // 加了新东西
        addComputer();
    }
}
