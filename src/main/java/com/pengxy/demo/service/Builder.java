package com.pengxy.demo.service;

public class Builder {
    private String eyes;
    private String legs;
    private String hands;

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getHands() {
        return hands;
    }

    public void setHands(String hands) {
        this.hands = hands;
    }
    public void human(){
        System.out.println("组成了一个人");
    }
}
