package com.pengxy.demo.DecoratorPattern;

/**
 * @program demo
 * @description: 继承2013
 * @author: pengxuanyu
 * @create: 2020/12/05 11:33
 */
public class Hyxz2019 extends Hyxz2013 {
    public Hyxz2019(House house) {
        super(house);
    }

    public void addTV(){
        Hyxz1501 hyxz1501 = (Hyxz1501)house;
        hyxz1501.getGoods().add("新电视");
        System.out.println("2019年买了新电视");
    }

    @Override
    public void goods() {
        super.goods();
        addTV();
    }
}
