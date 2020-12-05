package com.pengxy.demo.DecoratorPattern;

import java.util.ArrayList;

/**
 * @program demo
 * @description: implement Houer interface
 * @author: pengxuanyu
 * @create: 2020/12/05 11:13
 */
public class Hyxz1501 implements House{
    private ArrayList<String> humanbeings = new ArrayList<String>();
    private ArrayList<String> goods = new ArrayList<String>();


    @Override
    public void people() {
        humanbeings.add("老爸");
        humanbeings.add("老妈");
        humanbeings.add("我");
        System.out.println("一家三口");
    }

    public ArrayList<String> getHumanbeings() {
        return humanbeings;
    }

    public ArrayList<String> getGoods() {
        return goods;
    }

    @Override
    public void goods() {
        goods.add("电脑");
        goods.add("冰箱");
        System.out.println("家里只有电脑和冰箱");
    }
}
