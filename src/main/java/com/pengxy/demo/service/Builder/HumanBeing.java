package com.pengxy.demo.service.Builder;


// 具体实现抽象建造者接口的类
public class HumanBeing extends HumanBuilder {
    @Override
    public void buildLegs(){
        builder.setLegs("我来组成大腿");
    }

    @Override
    public void buildEyes(){
        builder.setEyes("我来组成眼睛");
    }


    @Override
    public void buildHands() {
        builder.setHands("我来组成双手");
    }
}
