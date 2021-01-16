package com.pengxy.demo.service;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2021/01/16 12:04
 */
public class LocalAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localAdd = InetAddress.getLocalHost();
        System.out.println("My MacBook localAddress is " + localAdd);
    }
}
