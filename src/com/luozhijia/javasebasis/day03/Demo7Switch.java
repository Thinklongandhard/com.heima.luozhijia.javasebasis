package com.luozhijia.javasebasis.day03;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-05-31
 * 15:46
 */
/*
* 案例实现：
*   键盘录入星期数，显示今天的减肥活动
*   星期一到星期五（工作日）
*   星期六到星期天（休息日）
* */
public class Demo7Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        //switch击穿效果
        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
        }
    }
}
