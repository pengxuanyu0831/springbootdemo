package com.pengxy.demo.NotionDemo.Algorithm;

/**
 * @program key 查找的目标
 * @param
 * @description:
 * @author: pengxuanyu
 * @create: 2020/12/31 20:43
 */
public class recursionBinarySearch {

    public static int recursionBinarySearch(int key,int[] arry,int low,int high){
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
        int key = 3;

        int find = recursionBinarySearch(key,arry,0,arry.length -1);
        if(find ==-1){
            System.out.println("find = 4");
        }else {
            System.out.println("find != 4");
        }
    }

}
