package JavaSEAdvance.com.luozhijiaTest.day08.Demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @anthor longway
 * @create 2022-06-21
 * 10:05
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
                 list.add("张三");
                 list.add("李四");
                 list.add("王五");

                 System.out.println("=============for循环遍历(get方法)=============");
                 for (int i = 0; i < list.size(); i++) {
                         System.out.println(list.get(i));
                 }

                 System.out.println("=============增强for循环遍历=============");
                 for (String s:list){
                     System.out.println(s);
                 }
                 System.out.println("============使用迭代器正序遍历============");
                 ListIterator<String> it=list.listIterator();
                 while(it.hasNext()){
                         System.out.println(it.next());
                 }

                 System.out.println("============使用迭代器逆序遍历============");
                 while(it.hasPrevious()){
                         System.out.println(it.previous());
                 }
    }
}
