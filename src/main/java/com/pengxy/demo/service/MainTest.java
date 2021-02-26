package com.pengxy.demo.service;

import java.util.Scanner;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2021/02/26 11:07
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println("请输入要打印的等腰三角形高度: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i <= n; i++){
            for(int k= 1;k <= n - i;k++){
                System.out.print(" ");
            }
            for(int j =1;j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
