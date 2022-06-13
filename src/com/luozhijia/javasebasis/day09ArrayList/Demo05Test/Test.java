package com.luozhijia.javasebasis.day09ArrayList.Demo05Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-09
 * 17:30
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        ArrayList<StudentData> list = new ArrayList<>();
        StudentData s1 = new StudentData("张三","heima01",18);
        StudentData s2 = new StudentData("李四","heima02",20);
        StudentMod mod = new StudentMod();
        mod.zhengjia(pass,list);
        while (true){
            System.out.println("请选择你要执行的操作");
            System.out.println("输入数字1增加新的数据");
            System.out.println("输入数字2删除选定数据");
            System.out.println("输入数字3更改选定数据");
            System.out.println("输入数字4查询选定数据");
            System.out.println("退出系统");
        }
    }
}
