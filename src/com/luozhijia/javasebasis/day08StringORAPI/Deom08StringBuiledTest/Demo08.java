package com.luozhijia.javasebasis.day08StringORAPI.Deom08StringBuiledTest;
import java.util.Scanner;
/**
 * @anthor longway
 * @create 2022-06-07
 * 18:25
 */
/*
需求：判断是否是对称字符串
   键盘录入一段字符串，进行判断
 */
public class Demo08 {
    public void panduan(){
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        //截取后半段字符串
        String end = data.substring((data.length())/2);
        //System.out.println(end);
        //截取前半段
        String start = data.substring(0,(data.length())/2);
        //System.out.println(start);

        //将后半段进行反转
        sb.append(end);
        sb.reverse();
        //System.out.println(sb);  成功

        //比较是否是对称的
        String end1 = sb.toString();
        if (end1.equals(start)){
            System.out.println("是对称字符串");
        }else{
            System.out.println("不是对称字符串");
        }
    }
}
