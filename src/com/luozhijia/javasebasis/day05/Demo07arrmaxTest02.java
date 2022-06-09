package com.luozhijia.javasebasis.day05;

import java.time.chrono.MinguoChronology;

/**
 * @anthor longway
 * @create 2022-06-04
 * 11:58
 */
/*
   需求：
     定义一个方法数组获取最大值：
        输出台打印【10,20,30,40】
 */
public class Demo07arrmaxTest02 {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40};
        int[] maxandmin = getMaxAndMin(arr);
        System.out.println(maxandmin[0] + " " + maxandmin[1]);
    }
    public static int[] getMaxAndMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 1;i < arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }else if (arr[i] < min){
                min = arr[i];
            }
        }
        int[] maxANDmin = new int[]{max,min};
        return maxANDmin;
    }
}
