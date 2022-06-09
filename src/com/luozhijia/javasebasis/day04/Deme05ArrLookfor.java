package com.luozhijia.javasebasis.day04;
import javax.swing.plaf.synth.SynthSpinnerUI;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-02
 * 13:24
 */
/*
* 已知数组 arr{1,99,66,77,88}
*      键盘输入一个数，返回数组中该元素的索引
* */
public class Deme05ArrLookfor {
    public static void main(String[] args) {
        System.out.println("请输入要查找的数字");
        Scanner sc = new Scanner(System.in);
        int saw = sc.nextInt();
        int index = -1;
        int[] arr = new int[]{1,99,66,77,88};
        over: for (int i = 0;i < arr.length;i++){
            if (arr[i] == saw){
                System.out.println("该元素的索引为" + i);
                index = i;
                break over;
            }
        }
        if (index == -1){
            System.out.println("没有找到数字");
        }
    }
}
