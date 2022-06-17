package JavaSEAdvance.com.luozhijia.day05.ListDemo9Test;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @anthor longway
 * @create 2022-06-17
 * 7:43
 */
//定义集合方法
    //三种遍历模式
public class ListDemo9 {
    public void show(Student9 s, List<Student9> list){
        //for循环遍历
        //拿出每一个Student8 对象
        for (int i = 0; i < list.size(); i++) {
            s = list.get(i);
            System.out.println(s.getName() + s.getAge() + "岁了，");
        }
    }
    public void show1(Student9 s2, List<Student9> list){
        //ListIterator遍历器，List集合专属遍历器
        //拿出每一个Student8 对象
        ListIterator<Student9> it9 = list.listIterator();
        while (it9.hasNext()){
            s2 = it9.next();
            System.out.println(s2.getName() + s2.getAge() + "岁了，");
        }
    }
    public void show2(Student9 s1, List<Student9> list){
        //Interator循环遍历
        //拿出每一个Student8 对象
        Iterator<Student9> it = list.iterator();
        while (it.hasNext()){
            s1 = it.next();
            System.out.println(s1.getName() + s1.getAge() + "岁了，");
        }
    }
    public void show3(Student9 s, List<Student9> list){
        //for循环遍历
        //拿出每一个Student8 对象
        for(Student9 s9 : list){
            System.out.println(s9.getName() + s9.getAge() + "岁了，");
        }
    }
}
