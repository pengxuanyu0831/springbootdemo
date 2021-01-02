package com.pengxy.demo.NotionDemo.Algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2021/01/02 10:19
 */
public class RecursionBinarySearchDemo2 {
    //static ArrayList names = new ArrayList<String>();
    public static <T> int  RecursionBinarySearchDemo2(int low, int high, List<T> names, T value, Comparator<? super T> comparator){
        if(comparator == null){
            throw new IllegalArgumentException("comparator is not allow null");
        }
        while(low < high){
            int mid = (low + high) >>> 1;
            T midValue = names.get(mid);

            if(comparator.compare(midValue,value)<0){
                low = mid + 1;
            }else if(comparator.compare(midValue,value)>0){
                high = mid - 1;
            }else{
                return mid;
            }
        }
        return low;
    }

    public static void main(String[] args){
        ArrayList names = new ArrayList<String>();
        names.add("peter");
        names.add("bill");
        names.add("jack");
        names.add("uzi");
        names.add("weixiao");
        names.add("pdd");

        // RecursionBinarySearchDemo2.RecursionBinarySearchDemo2(0,names.size(),names,"uzi",);


    }

    public static void find(Integer value,List<Integer> names){
        System.out.println("value is  " + value );
    }
};
