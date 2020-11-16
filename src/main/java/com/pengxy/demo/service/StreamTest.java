package com.pengxy.demo.service;

import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args){
        String str  = "My name is bond ,james bond!";
        Stream.of(str.split(" ")).filter(s -> s.length() >2 ).map(s -> s.length()).forEach(System.out::println);
    }
}
