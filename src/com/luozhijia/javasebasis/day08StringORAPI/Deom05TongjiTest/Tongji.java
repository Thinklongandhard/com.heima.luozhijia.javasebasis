package com.luozhijia.javasebasis.day08StringORAPI.Deom05TongjiTest;
import java.util.Scanner;
/**
 * @anthor longway
 * @create 2022-06-07
 * 16:44
 */
/*
需求：
    键盘录入一串字符，统计大写字符有多少，小写字符有多少，数字有多少
 */
public class Tongji {
    //三个统计变量
    int caps = 0;
    int small = 0;
    int num = 0;
    public Tongji(){
        String s = "ABCabc123";
        //变量拿到每一个字符
        //用一个字符数组存储
        char[] cha = new char[s.length()];
        for (int i = 0;i < s.length();i++){
            cha[i] = s.charAt(i);
        }
        //判断
        for (int i = 0;i < cha.length;i++){
            if (cha[i] >= 'A' & cha[i] <= 'Z'){
                caps++;
            }else if (cha[i] >= 'a' & cha[i] <= 'z'){
                small++;
            }else if(cha[i] >= '0' & cha[i] <= '9'){
                num++;
            }
        }
        System.out.println("大写字符有：" + caps + " 个");
        System.out.println("小写字符有：" + small + " 个");
        System.out.println("数字字符有：" + num + " 个");
    }

}
