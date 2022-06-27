package JavaSEAdvance.com.luozhijiaTest.day08.Demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * @anthor longway
 * @create 2022-06-21
 * 8:57
 */
/*
请定义一个可以存储“整数”的集合，并存储一些数据。
		请按以下要求顺序编程实现：
	对集合中的数据打乱顺序；
	打印集合
	对集合中的数据进行升序排序
	打印集合
	对集合中的数据进行降序排序(要实现排序，不可以倒序遍历实现)
	打印集合

 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(15);
        arr.add(10);
        arr.add(19);
        arr.add(1);
        Collections.shuffle(arr);
        for (Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        show(arr);
        System.out.println();
        show1(arr);
    }
    //升序，自然排序
    public static void show(ArrayList<Integer> arr){
        Collections.sort(arr);
        for (Integer i : arr){
            System.out.print(i + " ");
        }
    }
    //倒序输出
    public static void show1(ArrayList<Integer> arr) {
        //public static void reverse(List<?> list)
//        Collections.reverse(arr);
////        for (int i = 0; i < arr.size(); i++) {
////            System.out.print(arr.get(i) + " ");
////        }
//        for (Integer it : arr){
//            System.out.print(it + " ");
//        }
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            list.add(arr.get(i));
        }
        System.out.println(list);



        //Iterator
        ListIterator<Integer> ll = list.listIterator();
        while (ll.hasPrevious()){
            int num = ll.previous();
            System.out.print(num + " ");
        }
    }
}
