package javaSE.day03Homework.Demo04;

import java.util.Random;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-14
 * 20:52
 */

//键盘录入一个整数，创建一个该长度的数组，为每一个元素赋值为1-10的随机整数，最后打印数组中所有值大于5且为偶数的元素.
public class RandomTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(11);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "，");
        }
        System.out.println();
        System.out.println("------------------");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5 & (arr[i]%2)==0){
                System.out.println(arr[i]);
            }
        }
    }
}
