package com.luozhijia.javasebasis.day03;

/**
 * @anthor longway
 * @create 2022-05-31
 * 15:46
 */
/*
* 案例实现：
*   电梯运行，每层一停，跳过第四层
* */
public class Demo11Continuetest {
    public static void main(String[] args){
        for (int i = 1;i < 25;i++){
            if (i == 4){
                continue;
            }
            System.out.println("现在到达：" + i + "层");
        }
    }
}
