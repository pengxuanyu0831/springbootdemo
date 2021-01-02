package com.pengxy.demo.NotionDemo.Algorithm;

/**
 * @program 二分法 demo
 * @param
 * @description:
 * @author: pengxuanyu
 * @create: 2020/12/31 20:43
 */
public class recursionBinarySearch {

    public static int recursionBinarySearch(int key,int[] arry,int low,int high){
        if(key < arry[low] || key > arry[high] || low > high){
            return -1;
        }


        int middle = (low + high) / 2;
        if(arry[middle] < key){
            return recursionBinarySearch(key,arry ,middle + 1 ,high);
        }else if(arry[middle] > key){
            return recursionBinarySearch(key,arry,low,middle - 1);
        }else {
            return middle;
        }
    }


    public static void main(String[] args) {
        int[] arry = {1,2,3,4,5,6,7,8};
        // String[] arry1 = {"bill",""};
        int key = 1;

        int find = recursionBinarySearch(key,arry,0,arry.length -1);
        if(find == -1){
            System.out.println("找的是" + key + ", 位置是 " + find);
        }else {
            System.out.println("找的是" + key + ", 位置是" + find);
        }
    }

}
