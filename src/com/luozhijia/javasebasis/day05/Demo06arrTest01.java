package com.luozhijia.javasebasis.day05;

/**
 * @anthor longway
 * @create 2022-06-04
 * 11:58
 */
/*
   需求：
     定义一个方法完成数组遍历：
        输出台打印【10,20,30,40】
 */
public class Demo06arrTest01 {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40};
        sc(arr);
    }
    public static void sc(int[] arr){
        System.out.print("[");
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] );
            if (i != arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
