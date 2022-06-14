package javaSE.day03Homework.Demo01;

import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-14
 * 20:27
 */
//定义一个含有五个元素的数组,并为每个元素赋值,求数组中所有元素长度最长的数据
public class ArrayTest {
    public static void main(String[] args) {
        //定义数组,键盘接受数据
        String[] strings = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.next();
        }
        //遍历
        int long1 = strings[0].length();
        String long2 = null;
        for (int i = 0; i < strings.length; i++) {
            if (long1 < strings[i].length()){
                long1 = strings[i].length();
                long2 = strings[i];
            }
        }
        //输出最长的数据的长度
        System.out.println("最长的数据的长度是：" + long1 + "，他是数据：" + long2);
    }
}
