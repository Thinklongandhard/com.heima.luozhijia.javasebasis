package com.luozhijia.javasebasis.day09ArrayList.Demo02ArrayList;

import java.util.ArrayList;

/**
 * @anthor longway
 * @create 2022-06-09
 * 16:03
 */
public class ArrayListModtest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");

        //删除
        String b = arrayList.remove(1);  //根据索引  返回删除的元素
        boolean a = arrayList.remove("1");  //根据元素 返回是否成功删除
        System.out.println(a);
        System.out.println(b);

        //修改
        String c = arrayList.set(2,"aaa");
        System.out.println(c);
        System.out.println(arrayList);

        //查询
        String one = arrayList.get(0);
        String two = arrayList.get(1);
        System.out.println(one);
        System.out.println(two);

        System.out.println("-------------------------");
        //返回集合中元素的个数
        System.out.println(arrayList.size());
    }
}
