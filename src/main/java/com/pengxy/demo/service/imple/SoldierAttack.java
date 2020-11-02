package com.pengxy.demo.service.imple;

import com.pengxy.demo.service.Attack;

/**
 * @author pengxuanyu
 */
public class SoldierAttack implements Attack {
    @Override
    public void action(){
        System.out.println("小兵击杀了");
    }
}
