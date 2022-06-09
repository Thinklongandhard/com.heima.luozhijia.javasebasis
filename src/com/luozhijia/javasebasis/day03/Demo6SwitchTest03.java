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
*   星期一：游泳
*   星期二：跑步
*   星期三：打篮球
*   星期四：拳击
*   星期五：动感单车
*   星期六：爬山
*   星期天：慢走
* */
public class Demo6SwitchTest03 {
    public static void main(String[] args){
        while (true) {
            Scanner sc = new Scanner(System.in);
            int day = sc.nextInt();
            if (day > 0 & day < 8) {
                switch (day) {
                    case 1:
                        System.out.println("游泳");
                        break;
                    case 2:
                        System.out.println("跑步");
                        break;
                    case 3:
                        System.out.println("打篮球");
                        break;
                    case 4:
                        System.out.println("拳击");
                        break;
                    case 5:
                        System.out.println("动感单车");
                        break;
                    case 6:
                        System.out.println("爬山");
                        break;
                    case 7:
                        System.out.println("慢走");
                        break;
                    default:
                        System.out.println("给爷死");
                        break;
                }
            }else if(day == 0) {
                System.out.println("给爷死");
                break;
            }
        }
    }
}
