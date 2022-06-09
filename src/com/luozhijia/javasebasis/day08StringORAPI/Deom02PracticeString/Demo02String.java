package com.luozhijia.javasebasis.day08StringORAPI.Deom02PracticeString;

/**
 * @anthor longway
 * @create 2022-06-07
 * 15:21
 */
public class Demo02String {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1.length());

        //s1是一个对象，s1 = “bcd” ~~> String s1 = new String("bcd");
        //这个s1和上边s1存储的“abc”是两个不同的对象
        s1 = "bcd";//这里不是修改了s1的值，
        //这只是进行了替换 ，内存空间中既有“abc”的存储空间也有“bcd”的存储空间

        System.out.println(s1);
    }
}
