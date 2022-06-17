package JavaSEAdvance.com.luozhijia.day05.ListDemo11Linked;

import java.util.LinkedList;

/**
 * @anthor longway
 * @create 2022-06-17
 * 9:25
 */

public class LinkedMouthd {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        //public void addFirst(E e)
        ll.addFirst("hello");
        System.out.println(ll);
        System.out.println("-----------");
        //public void addLast(E e)
        ll.addLast("work");
        System.out.println(ll);
        System.out.println("-----------");
        //public E getFirst()
        String s1 = ll.getFirst();
        System.out.println(s1);
        System.out.println("-----------");
        //public E getLast()
        String s = ll.getLast();
        System.out.println(s);
        System.out.println("-----------");
        //public E removeFirst()
        String s3 = ll.removeFirst();
        System.out.println(s3);
        System.out.println("-----------");
        //public E removeLast()
        String s2 = ll.removeLast();
        System.out.println(s2);
        System.out.println("-----------");
    }
}
