package javaSE.day03Homework.DemoAdvance03;

import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-14
 * 21:17
 */
/*
从键盘上输入10个整数，合法值为1、2或3，不是这3个数则为非法数字。试编程统计每个整数和非法数字的个数。

        打印格式：
        请输入10个整数：
        1
        2
        3
        3
        2
        1
        3
        3
        5
        6
        数字1的个数：2
        数字2的个数：2
        数字3的个数：4
        非法数字的个数：2
*/
public class Demo {
    //从键盘上输入10个整数，合法值为1、2或3，不是这3个数则为非法数字。试编程统计每个整数和非法数字的个数。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        int bu = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 1 &num[i] != 2 &num[i] != 3 ){
                bu++;  //不合法
            }else if(num[i] == 1){
                one++;
            }else if(num[i] == 2){
                two++;
            }else if(num[i] == 3){
                three++;
            }
        }
        /*数字1的个数：2
        数字2的个数：2
        数字3的个数：4
        非法数字的个数：2*/
        System.out.println("数字1的个数：" + one);
        System.out.println("数字2的个数：" + two);
        System.out.println("数字3的个数：" + three);
        System.out.println("非法数字的个数：" + bu);
    }
}
