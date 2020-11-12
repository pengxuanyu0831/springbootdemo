package com.pengxy.demo.service;

abstract class HumanBuilder {
    protected Builder builder = new Builder();
    public abstract void buildEyes();
    public abstract void buildLegs();
    public abstract void buildHands();
    public Builder getBuilder(){
        return builder;
    }
}
