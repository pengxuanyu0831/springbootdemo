package com.pengxy.demo.service;

public class EuqalsTest {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("hello");
        String str1 = sb.toString();
        String str2 = new String("hello");
        System.out.println("str1 的hashCode:"+ str1.hashCode());
        System.out.println("str2 的hashCode:"+ str2.hashCode());
        if(str1.equals(str2)){
            System.out.println("str1 euqals str2");
        }else {
            System.out.println("str1 no-equals str2");
        }

        if (str1 == str2){
            System.out.println(" str1 == str2 ");
        }else{
            System.out.println("str1 != str2");
        }
    }
}
