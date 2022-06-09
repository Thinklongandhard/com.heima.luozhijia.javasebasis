package com.luozhijia.javasebasis.day06;

/**
 * @anthor longway
 * @create 2022-06-04
 * 19:15
 */
/*
   ^ 运算符的特点
       一个数，被另一个数异或两次，该数本身不变
   需求：
      实现数据交换
      将一个数组进行反转，在不使用第三方变量的情况下进行数据交换
*/
public class Demo04YiHuoTest02 {
    public static void main(String[] args) {
        int[] num = new int[]{11,22,33,44,55};
        //定义两个指针
        for (int start=0,end= num.length-1;start<=end;start++,end--){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
        }
        for (int i = 0;i < num.length;i++){
            System.out.println(num[i]);
        }
    }
}
