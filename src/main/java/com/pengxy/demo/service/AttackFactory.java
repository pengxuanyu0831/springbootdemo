package com.pengxy.demo.service;

import com.pengxy.demo.service.imple.HeroAttack;
import com.pengxy.demo.service.imple.SoldierAttack;

public class AttackFactory {
    public Attack produce(String type){
        if("hero".equals(type)){
            return new HeroAttack();
        }else if ("soldier".equals(type)){
            return new SoldierAttack();
        }else{
            System.out.println("类型不正确");
            return null;
        }
    }
}
