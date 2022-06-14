package javaSE.day03Homework.Demo02;
import java.util.Random;
/**
 * @anthor longway
 * @create 2022-06-14
 * 20:40
 */
/*
定义一个长度为3的一维数组,给每个元素赋值. (要求数组中每个元素的值是0-9的随机数)
        遍历数组打印每个元素的值
*/
public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
