package com.luozhijia.javasebasis.day04;
import java.util.Random;

/**
 * @anthor longway
 * @create 2022-06-02
 * 13:24
 */
/*
* 裁判打分：
*      6个裁判，去掉最低和最高分，取平均成绩，不计小数
*
* */
public class Deme06ArrTest {
    public static void main(String[] args) {
        Random r = new Random();
        int[] poil = new int[6];
        //获取评委打分
        for (int i = 0;i < poil.length;i++){
            poil[i] = r.nextInt(101);
        }
        //输出评委打分
        for (int i = 0; i < poil.length;i++){
            System.out.print(poil[i] + " ");
        }
        System.out.println("");
        System.out.println("------------");
        //去掉最低和最高分，取平均成绩
        int min=poil[0],max=0;
        int sum = 0;
        for (int i = 0;i < poil.length;i++){
            if (poil[i] > max){
                max = poil[i];
            }
            if(poil[i] <= min) {
                min = poil[i];
            }
            sum += poil[i];
        }

        int end = (sum-max-min)/4;
        System.out.println(end);
        /*System.out.println(max);
        System.out.println(min);*/
    }
}
