package JavaSEAdvance.com.luozhijia.day02.Demo04;

import JavaSEAdvance.com.luozhijia.day02.Demo03.Animale;

/**
 * @anthor longway
 * @create 2022-06-15
 * 8:35
 */
/*      1、向上转型
        从子类到父类
         父类引用指向子类对象
        2、向下转型
        从父类到子类
         父类引用转为子类对象*/

public class Demo {
    public static void main(String[] args) {
        //向上转型
        Animale a = new Cat();  //父类引用a指向子类对象new Cat()
        a.eat();


        Animale a1 = new Animale();
        //向下转型
        Cat c = (Cat)a1;  //把a1类型强转为Cat类型，赋值给c
        //吧父类引用转为子类对象
        c.eat();
        c.paly();
        //可以访问到子类的特有功能
    }
}
