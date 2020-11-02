package com.pengxy.demo.service;

public class FactoryTest {
    public static void main(String[] args){
        AttackFactory attackFactory = new AttackFactory();
        Attack attack = attackFactory.produce("hero");
        attack.action();
    }
}
