package com.luozhijia.javasebasis.day05;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-04
 * 11:58
 */
/*
   需求：
     设计比较两个整数是否相同
     利用方法重载，使其兼容所有整数类型（int byte short long）
 */
public class Demo04Regain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ints = new int[2];
        for (int i = 0;i < ints.length;i++){
            ints[i] = sc.nextInt();
        }
        byte[] bytes = new byte[2];
        for (int i = 0;i < bytes.length;i++){
            bytes[i] = sc.nextByte();
        }
        short[] shorts = new short[2];
        for (int i = 0;i < shorts.length;i++){
            shorts[i] = sc.nextShort();
        }
        long[] longs = new long[2];
        for (int i = 0;i < longs.length;i++){
            longs[i] = sc.nextLong();
        }
        System.out.println(Sum(ints[0],ints[1]));
        System.out.println(Sum(bytes[0],bytes[1]));
        System.out.println(Sum(shorts[0],shorts[1]));
        System.out.println(Sum(longs[0],longs[1]));
    }
    public static boolean Sum(int a,int b){
        return a == b;
    }
    public static boolean Sum(byte a,byte b){
        return a == b;
    }
    public static boolean Sum(short a,short b){
        return a == b;
    }
    public static boolean Sum(long a,long b){
        return a == b;
    }
}
