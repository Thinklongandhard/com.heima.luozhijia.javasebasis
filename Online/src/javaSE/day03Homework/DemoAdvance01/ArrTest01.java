package javaSE.day03Homework.DemoAdvance01;

import java.util.Random;

/**
 * @anthor longway
 * @create 2022-06-14
 * 21:00
 */

/*将数字1-10保存到一个长度为10的一维数组中
        定义一个新数组,长度为3,取出原来数组中随机三个元素(不考虑是否重复)
        给新数组的元素赋值
        求新数组所有元素的和*/


public class ArrTest01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 1; i <= arr.length; i++) {
            arr[i-1] = i;
        }
        //定义一个新数组,长度为3,取出原来数组中随机三个元素(不考虑是否重复)
        int[] arr1 = new int[3];
        Random r = new Random();
        for (int i = 0; i < arr1.length; i++) {
            //给新数组的元素赋值
            arr1[i] = r.nextInt(11);
        }
        //求新数组所有元素的和
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println(sum);
    }
}
