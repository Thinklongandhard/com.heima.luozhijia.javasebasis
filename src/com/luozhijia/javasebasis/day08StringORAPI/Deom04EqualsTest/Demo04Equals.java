package com.luozhijia.javasebasis.day08StringORAPI.Deom04EqualsTest;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-07
 * 16:12
 */
//需求：
    //已知用户的登录密码，创建用户登录页面，三次机会
public class Demo04Equals {
    private String Zhanghao ;
    private String cord ;
    public Demo04Equals(){

    }
    public Demo04Equals(String Zhanghao,String cord){
        this.Zhanghao = Zhanghao;
        this.cord = cord;
        Denglu();
    }

    public void Denglu(){
        Scanner sc = new Scanner(System.in);
        String[] cun = new String[2];
        for (int i = 0;i < cun.length;i++){
             cun[i] = sc.nextLine();
        }
        over: for (int i = 1;i <= 3;i++){
            if (cun[0].equals(this.Zhanghao) & cun[1].equals(this.cord)){
                System.out.println("欢迎登录");
                break over;
            }else{
                System.out.println("登录失败，你还有" + (3-i) + "次机会");
                break ;
            }
        }

    }
}
