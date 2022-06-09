package com.luozhijia.javasebasis.day06;

/**
 * @anthor longway
 * @create 2022-06-05
 * 13:44
 */
/*
* 索引越界异常：
*
* */
public class Demo05ErWeiarr {
    public static void main(String[] args){
        //静态初始化
        int[][] arr1 = new int[][]{{11,00},{22,33}};
        //定义一个二维数组，可以存放三个一维数组，每个一维数组中可以存放3个元素
        int[][] arr = new int[3][3];
        //在堆内存中二维数组中2索引指向的一维数组开辟的存储空间只能存储3个元素，无法访问到3索引。
        //arr[2][3] = 11;  //这里产生了索引越界，
        //System.out.println(arr[2][3]);
        //java.lang.ArrayIndexOutOfBoundsException: 3  //索引越界


//内存地址的替换

        //这里定义了一个isArrlist数组，在堆内存中开辟了一个存储空间
        int[] isArrlist = new int[]{11,22,33,44};
        //堆内存中二维数组中2索引指向的一维数组开辟的存储空间只能存储3个元素，
        arr[2] = isArrlist; //这里将原本arr二维数组中的2索引指向的内存空间替换掉了，变成了isArrlist数组所指向的内存空间
        //在这里访问的时候，arr数组2索引指向的内存空间是isArrlist的内存空间不再是原本的二维数组定义时产生的内存空间。
        System.out.println(arr[2][3]);  //44可以访问到
    }
}
