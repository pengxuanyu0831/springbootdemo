package com.pengxy.demo.service;

import com.pengxy.demo.service.imple.HeroAttack;

public class HeroAttackFactory implements Provider {
    @Override
    public Attack produce(){
        return new HeroAttack();
    }
}
