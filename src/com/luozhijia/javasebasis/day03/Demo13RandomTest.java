package com.luozhijia.javasebasis.day03;
import java.util.Random;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-05-31
 * 15:46
 */
/*
* 案例实现：
*   猜数字；
* */
public class Demo13RandomTest {
    public static void main(String[] args){
        Random r = new Random();
        int number = r.nextInt(501);
        caishuzi: while (true) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num > number) {
                System.out.println("猜大了");
            }else if (num < number){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了！");
                break caishuzi;
            }
        }
    }
}
