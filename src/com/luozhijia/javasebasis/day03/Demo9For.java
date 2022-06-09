package com.luozhijia.javasebasis.day03;

/**
 * @anthor longway
 * @create 2022-05-31
 * 15:46
 */
/*
* 案例实现：
*   0~1000中的水仙花数
* */
public class Demo9For {
    public static void main(String[] args){
        int ge,shi,bai;
        int[] num = new int[4];
        int b=0;
        for(int i = 1;i < 1000;i++){

            if (i>100){
                bai = i/100;
                shi = (i/10)%10;
                ge = i%10;
                if (bai * bai * bai + shi * shi * shi + ge * ge * ge == i) {
                    num[b] = i;
                    b++;
                }
            }
        }
        for (int i=0;i<4;i++){
            if (i<2){
                System.out.print(num[i] + " ");
                if (i == 1){
                    System.out.println("");
                }
            }else{
                System.out.print(num[i] + " ");
            }
        }
    }
}
