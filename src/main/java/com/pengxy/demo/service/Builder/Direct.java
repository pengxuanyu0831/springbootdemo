package com.pengxy.demo.service.Builder;



class Direct {
    private HumanBuilder builder;

    public Direct(HumanBuilder builder){
        this.builder = builder;
    }
    // 组成
    public Builder combat(){
        builder.buildEyes();
        builder.buildHands();
        builder.buildLegs();
        return builder.getBuilder();
    }
}
