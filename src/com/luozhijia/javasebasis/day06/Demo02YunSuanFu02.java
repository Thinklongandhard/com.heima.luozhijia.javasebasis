package com.luozhijia.javasebasis.day06;

/**
 * @anthor longway
 * @create 2022-06-04
 * 19:15
 */
/*
位移运算符：
	     << 有符号左移运算，二进制位向左移动，左边符号位丢弃，右边补齐0
		    运算规律：向左移动几位，就是乘以2的几次幂

		 >> 有符号右移运算，二进制位向右移动，使用符号位进行补充
		    运算规律：向右移动几位，就是除以2的几次幂

		 >>> 无符号的右移运算符，无论符号位是0还是1，都补0
*/
public class Demo02YunSuanFu02 {
    public static void main(String[] args){
        System.out.println(10 << 1);    // 10 * 2
        System.out.println(10 >> 1);    // 10 / 2
        System.out.println(10 >>> 2);   // 10 / 2*2

    }
}
