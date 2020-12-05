package com.pengxy.demo.DecoratorPattern;

/**
 * @program demo
 * @description: 装饰者类，持有了被修饰类的引用
 * 装饰者规定了装饰流程，就是规定了接口的调用过程，具体实现交由子类去实现
 * @author: pengxuanyu
 * @create: 2020/12/05 11:18
 */
public class Decorator implements House {
    public House house;

    public Decorator(House house) {
        this.house = house;
    }

    @Override
    public void people() {
        house.people();
    }

    @Override
    public void goods() {
        house.goods();
    }
}
