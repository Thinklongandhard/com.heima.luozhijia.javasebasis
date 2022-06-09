package com.luozhijia.javasebasis.day06;

/**
 * @anthor longway
 * @create 2022-06-05
 * 13:44
 */
/*
* 需求：
*   公司年销售额求和
*       第一季度：  11,22,33
*       第二季度：  44,55,66
*       第三季度：  11,22,35
*       第四季度：  44,55,65
* */
public class Demo05ErWeiarrTest {
    public static void main(String[] args){
        int sum = 0;
        //定义一个二维数组
        int[][] money = {{11,22,33},{44,55,66},{11,22,35},{44,55,65}};
        //变量二维数组
        for (int i = 0;i < money.length;i++){
            for (int j = 0;j < money[i].length;j++){
                //求和
                sum += money[i][j];
            }
        }
        System.out.println(sum);
    }
}
