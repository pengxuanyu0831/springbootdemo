package com.pengxy.demo.service.imple;

import com.pengxy.demo.service.Attack;

/**
 * @author pengxuanyu
 */
public class HeroAttack implements Attack {
    @Override
    public void action(){
        System.out.println("英雄击杀了");
    }
}
