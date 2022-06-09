package com.luozhijia.javasebasis.day03;

/**
 * @anthor longway
 * @create 2022-05-31
 * 15:46
 */
/*
* 案例实现：
*   珠穆朗玛峰8844430毫米，有一个0。1毫米的纸，折多少次能达到这个高度
* */
public class Demo10WhileZMLMF {
    public static void main(String[] args){
        int num = 0;
        double heigh = 0.1D;
        while (heigh<=8844430){
            heigh = heigh + heigh;
            System.out.println(heigh);
            num++;
        }
        System.out.println(num);
    }
}
