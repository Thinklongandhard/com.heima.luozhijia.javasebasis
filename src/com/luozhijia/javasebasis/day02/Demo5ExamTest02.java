package com.luozhijia.javasebasis.day02;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @anthor longway
 * @create 2022-05-31
 * 15:46
 */
//案例要求：
//   键盘录入成绩，根据不同的成绩给予不同奖励
public class Demo5ExamTest02 {
    public static void main(String[] args){
        int[]  number = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < number.length;i++){
            int num = sc.nextInt();
            if (num<=100&num>=80){
                System.out.println("考试成绩优秀，奖励2朵小红花");
            }else if(num<80&num>=60){
                System.out.println("考试成绩良好，奖励1朵小红花");
            }else if(num<60&num>0){
                System.out.println("考的很好，下次不要这样了");
                System.out.println("奖励一个你最喜欢的大嘴巴子");
            }else{
                System.out.println("给爷死!");
                break;
            }
            number[i] = num;
        }
    }
}
