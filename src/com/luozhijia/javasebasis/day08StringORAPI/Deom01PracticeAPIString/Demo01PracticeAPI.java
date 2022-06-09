package com.luozhijia.javasebasis.day08StringORAPI.Deom01PracticeAPIString;
import java.util.Scanner;
/**
 * @anthor longway
 * @create 2022-06-06
 * 21:07
 */
/*
* 需求：
*   跟去API文档学习录入字符串
*
*     public String nextLine()
*        将此扫描仪推进到当前行并返回跳过的输入。 此方法返回当前行的其余部分，不包括末尾的任何行分隔符。 该位置设置为下一行的开头。
*        由于该方法继续搜索通过输入寻找行分隔符的输入，所以如果不存在行分隔符，则它可以缓冲搜索行的所有输入，以跳过该行。
*
 * */
public class Demo01PracticeAPI {
    public  void Name() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
}
