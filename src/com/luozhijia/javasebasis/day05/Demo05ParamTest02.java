package com.luozhijia.javasebasis.day05;

/**
 * @anthor longway
 * @create 2022-06-04
 * 11:58
 */
/*
   基本数据类型：
       传递的是内存地址
 */
public class Demo05ParamTest02 {
    public static void main(String[] args) {
        int arr = 10;
        int arr1 = 20;
        System.out.println(arr1);
        sc(arr1);   //传递的是20这个数
        System.out.println(arr1);   //弹栈以后sc已经从栈内存中消失了，此时的arr1还是main方法中的arr1，数值并没有发生改变
    }
    public static void sc(int arr1){
        //此时在栈内存中重新开辟了一个sc的内存空间，并定义了arr1 初始值为20
        arr1 = 200;  //将arr1 赋值为200，改变的sc内存空间中的arr1的值，main内存空间中的arr1 的数值并没有发生改变
    }
}
