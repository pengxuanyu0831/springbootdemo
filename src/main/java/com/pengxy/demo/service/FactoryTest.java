package com.pengxy.demo.service;


public class FactoryTest {
    public static void main(String[] args){
        Provider provider = new HeroAttackFactory();
        Attack attack = provider.produce();
        attack.action();
    }
}
