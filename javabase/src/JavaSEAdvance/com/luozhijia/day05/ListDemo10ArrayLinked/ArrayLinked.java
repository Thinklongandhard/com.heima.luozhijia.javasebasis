package JavaSEAdvance.com.luozhijia.day05.ListDemo10ArrayLinked;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @anthor longway
 * @create 2022-06-17
 * 8:59
 */

//使用Arraylist和Linkedlist完成存储字符串和遍历
public class ArrayLinked {
    public static void main(String[] args) {
        //创建ArrayList对象
        ArrayList<String> al = new ArrayList<>();
        al.add("hello");
        al.add("work");
        al.add("java");
        //遍历调用方法
        show(al);

        //创建LinkedList集合
        //底层是链表
        //增删快，查询慢
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("java");
        ll.add("work");
        ll.add("hello");
        //调用方法遍历
        show1(ll);
    }

    //遍历方法
    public static void show(ArrayList<String> al){
        //for遍历
        for (int i = 0; i < al.size(); i++) {
            String s = al.get(i);
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("---------------");
        //Iterator遍历
        Iterator<String> it = al.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("---------------");
        //增强for
        for(String s : al){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("---------------");
    }

    public static void show1(LinkedList<String> ll){
        //for遍历
        for (int i = 0; i < ll.size(); i++) {
            String s = ll.get(i);
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("----------------");
        //Iterator遍历
        Iterator<String> it = ll.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("----------------");
        //增强for
        for(String s : ll){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("----------------");
    }
}
