package com.pengxy.demo.service.Builder;

import com.pengxy.demo.service.Builder.Builder;

/*
抽象的组成类，包含创建部件的抽象方法
 */
abstract class HumanBuilder {
    protected Builder builder = new Builder();
    public abstract void buildEyes();
    public abstract void buildLegs();
    public abstract void buildHands();
    public Builder getBuilder(){
        return builder;
    }
}
