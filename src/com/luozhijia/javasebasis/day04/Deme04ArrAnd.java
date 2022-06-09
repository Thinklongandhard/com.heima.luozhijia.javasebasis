package com.luozhijia.javasebasis.day04;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-02
 * 13:24
 */
/*
* 键盘录入10个数字
*      数组自动求和
* */
public class Deme04ArrAnd {
    public static void main(String[] args) {
        double[] arr = new double[10];
        double andone = 0.0;
        Scanner sc = new Scanner(System.in);
        for (int i=0;i < arr.length;i++){
            arr[i] = sc.nextDouble();
        }
        for (int i=0;i < arr.length;i++){
            andone += arr[i];
        }
        System.out.println(andone);

    }
}
