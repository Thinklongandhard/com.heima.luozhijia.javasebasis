package com.luozhijia.javasebasis.day02;

/**
 * @anthor longway
 * @create 2022-05-31
 * 15:46
 */
/*
* 案例实现：
*   三个和尚，身高为165，210，150，找出最大值
* */
public class Demo5Test01 {
    public static void main(String[] args){
        int one=165,two=210,three=150;
        int num = one > two ? one : two;
        num = num > three ? num : three;
        System.out.println(num);
    }
}
