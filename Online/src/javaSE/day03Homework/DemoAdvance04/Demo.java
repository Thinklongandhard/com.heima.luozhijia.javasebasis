package javaSE.day03Homework.DemoAdvance04;

import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-14
 * 21:25
 */

/*
假设有一个长度为5的数组，数组元素通过键盘录入，如下所示：
        int[] arr = {1,3,-1,5,-2}
        要求：
        创建一个新数组newArr[],新数组中元素的存放顺序与原数组中的元素逆序，并且如果原数组中的元素值小于0，
        在新数组中按0存储。最后输出原数组和新数组中的内容
*/
public class Demo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] newArr = new int[arr.length];
        int statr = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            newArr[statr] = arr[end];
            statr++;
            end--;
        }
        //最后输出原数组和新数组中的内容
        //原数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //新数组
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] <= 0){
                newArr[i] = 0;
            }
            System.out.print(newArr[i] + " ");
        }
    }
}
