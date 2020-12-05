package com.pengxy.demo.DecoratorPattern;

/**
 * @program demo
 * @description: main
 * @author: pengxuanyu
 * @create: 2020/12/05 11:38
 */
public class Test {
    public static void main(String[] args){
        House house = new Hyxz1501();
        System.out.println("---------初始情况：");
        house.goods();
        System.out.println("--------");

        House house1 = new Hyxz2013(house);
        System.out.println("---------2013年情况");
        house1.goods();
        System.out.println("---------");

        House house2 = new Hyxz2019(house);
        System.out.println("---------2019年情况");
        house2.goods();
        System.out.println("---------");

    }

}
