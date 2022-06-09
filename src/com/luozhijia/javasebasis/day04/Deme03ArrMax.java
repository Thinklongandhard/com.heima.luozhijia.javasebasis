package com.luozhijia.javasebasis.day04;
import java.util.Scanner;
/**
 * @anthor longway
 * @create 2022-06-02
 * 13:24
 */
/*
* 键盘录入10个数字
*      数组自动输出最大值
* */
public class Deme03ArrMax {
    public static void main(String[] args) {
        double[] arr = new double[10];
        double max;
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<10;i++){
            arr[i] = sc.nextDouble();
        }
        //比较最大值
        max = arr[0];
        for (int i=1;i<10;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
