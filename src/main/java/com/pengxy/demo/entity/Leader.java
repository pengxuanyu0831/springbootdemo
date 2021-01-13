package com.pengxy.demo.entity;

import java.io.Serializable;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2021/01/13 21:56
 */
public class Leader implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String number;
    private String belong;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", belong='" + belong + '\'' +
                '}';
    }
}
