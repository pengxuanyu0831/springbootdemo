package com.pengxy.demo.service.Builder;

public class Client {
    public static void main(String[] args){
        // 抽象的humanBuilder 可以 组成一个humanBeing
        HumanBuilder humanBuilder = new HumanBeing();
        // 把组成humanBeing 的【抽象方法整体】扔给指挥者
        Direct direct = new Direct(humanBuilder);
        // 由指挥者调用combat方法，创建了一个builder的对象
        Builder builder = direct.combat();
        // 形成一个human对象
        builder.human();
    }
}
