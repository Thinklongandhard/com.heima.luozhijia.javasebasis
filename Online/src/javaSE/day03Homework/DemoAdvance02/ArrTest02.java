package javaSE.day03Homework.DemoAdvance02;

import java.util.Random;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-14
 * 21:00
 */
/*
    1.键盘录入班级人数
	2.根据录入的班级人数创建数组
	3.利用随机数产生0-100的成绩(包含0和100)
	4.要求:
		(1)打印该班级的不及格人数
		(2)打印该班级的平均分
		(3)演示格式如下:
			请输入班级人数:
			键盘录入:100
			控制台输出:
				不及格人数:19
				班级平均分:87

        */
public class ArrTest02 {
    public static void main(String[] args) {
        //1.键盘录入班级人数
        System.out.println("请输入班级人数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //2.根据录入的班级人数创建数组
        int[] arr = new int[num];
        //3.利用随机数产生0-100的成绩(包含0和100)
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
        }
        //(1)打印该班级的不及格人数
        int num1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 60){
                num1++;
            }
        }
        System.out.println("不及格人数：" + num1);
        //(2)打印该班级的平均分
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum/num;
        System.out.println("该班级平均分为：" + avg);
    }
}
