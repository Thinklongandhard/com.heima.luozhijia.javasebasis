package com.luozhijia.javasebasis.day05;
import java.util.Scanner;
/**
 * @anthor longway
 * @create 2022-06-02
 * 19:48
 */
//方法调用
public class Demo01mod {
    public static void main(String[] args){
        JOpanduan();
        Demo01mod d = new Demo01mod();
        d.sa1();
    }
    public static void JOpanduan(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2 == 0){
            System.out.println("是一个偶数");
        }else{
            System.out.println("是一个奇数");
        }
    }
    public void sa1(){
        System.out.println("111");
    }

}

