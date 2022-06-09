package com.luozhijia.javasebasis.day05;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-04
 * 11:58
 */
/*
   引用数据类型：
       传递的是内存地址
 */
public class Demo05ParamTest01 {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20};
        System.out.println(arr[1]);
        sc(arr);   //传递的是内存地址
        System.out.println(arr[1]);   //虽然sc方法执行结束后，弹栈了，但是内存中存储的数据已经发生了改变
    }
    public static void sc(int[] arr){
        //两个不同方法的数组指向同一个内存地址
        arr[1] = 200;  //改变数组arr[1]的值
    }
}
