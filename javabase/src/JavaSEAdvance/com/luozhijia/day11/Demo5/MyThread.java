package JavaSEAdvance.com.luozhijia.day11.Demo5;

import java.util.*;

/**
 * @anthor longway
 * @create 2022-06-23
 * 15:57
 */
public class MyThread {
    //线程安全类
    public static void main(String[] args) {
        //在要求线程安全的情况下，StringBuffer还有使用
        StringBuffer sb = new StringBuffer();
        StringBuilder sb1 = new StringBuilder();

        //Map
        //这里的Hashtable被更简洁的方法代替了，用的并不多
        Map<String,String> map = Collections.synchronizedMap(new HashMap<String,String>());
        //这个类中的方法虽然没有加锁，但是实现了同步代码块
        Hashtable<String,String> ht = new Hashtable<String,String>();
        HashMap<String,String> hm = new HashMap<String,String>();

        //List集合
        //这里的Vector被更简洁的方法代替了，用的并不多
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
        //这个类中的方法虽然没有加锁，但是实现了同步代码块
        Vector<String> v = new Vector<String>();
        ArrayList<String> al = new ArrayList<String>();
    }
}
