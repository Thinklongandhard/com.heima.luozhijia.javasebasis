package com.luozhijia.javasebasis.day02;

/**
 * @anthor longway
 * @create 2022-05-31
 * 15:46
 */
public class Demo4PeratorError {
    public static void main(String[] args){
        /*short s = 1;
        s = s + 10;   错误原因：s是short类型，10是常量默认是int类型，s+10结果为int类型，赋值给s需要进行强转
        System.out.println(s);*/
        short s = 1;
        s = (short) (s + 10);
        System.out.println(s);

        short ss = 1;
        ss += 10;   //扩展赋值运算符底层自带强转
        System.out.println(ss);
    }
}
