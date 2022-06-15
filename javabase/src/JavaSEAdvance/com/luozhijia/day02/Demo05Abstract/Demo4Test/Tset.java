package JavaSEAdvance.com.luozhijia.day02.Demo05Abstract.Demo4Test;

/**
 * @anthor longway
 * @create 2022-06-15
 * 11:00
 */
public class Tset {
    public static void main(String[] args) {
        Animale a = new Cat();
        a.eat();
        //向下转型，强转
        Cat c = (Cat)a;
        c.show1();
        System.out.println("----------");

        Cat c1 = new Cat(18,"小黑");
        c1.show();
        System.out.println("-----------");

        Cat c2 = new Cat();
        c2.setAge(20);
        c2.setName("小篮");
        c2.show();
    }
}
