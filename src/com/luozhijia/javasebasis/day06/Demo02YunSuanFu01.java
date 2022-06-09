package com.luozhijia.javasebasis.day06;

/**
 * @anthor longway
 * @create 2022-06-04
 * 19:15
 */
/*
位移运算符：
	 位运算符指的是二进制位的运算，现将十进制数转换成二进制后，再进行运算。
	 (1代表true，0代表false）
	       6的二进制  0110
	     & 2的二进制  0010  -->结果为 0010（遇false则false，遇0则0）
	     | 位（或）：遇true则true，遇1则1
	     ^ 位（异或）：相同为false，不同则为true
	     ~ 位（取反）：全部取反，0变1,1变0（包括符号位）
*/
public class Demo02YunSuanFu01 {
    public static void main(String[] args){
        System.out.println(6 & 2);    //0010
        System.out.println(6 | 2);    //0110
        System.out.println(6 ^ 2);    //0101
        System.out.println(~6);       //1 0001   第一位是符号位， --> 求反码 --> 1 0000 --> 原码 --> 1 0111  --> -7
    }
}
