package com.luozhijia.javasebasis.day04;

/**
 * @anthor longway
 * @create 2022-06-02
 * 13:24
 */
/*数组的静态初始化*/

public class Deme02ArrStatic {
    public static void main(String[] args) {
        //简化格式
        int[] arr = {1,2,3,4};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println("------------------");
        //完整格式
        int[] arr2 = new int[]{11,22,33,44};
        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
    }
}
