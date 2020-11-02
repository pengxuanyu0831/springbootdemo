package com.pengxy.demo.service;

import com.pengxy.demo.service.imple.SoldierAttack;

public class SoldierAttackFactory implements Provider {
    @Override
    public Attack produce(){
        return new SoldierAttack();
    }
}
