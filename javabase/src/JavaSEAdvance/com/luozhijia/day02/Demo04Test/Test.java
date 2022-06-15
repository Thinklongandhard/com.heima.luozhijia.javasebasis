package JavaSEAdvance.com.luozhijia.day02.Demo04Test;

/**
 * @anthor longway
 * @create 2022-06-15
 * 8:53
 */
//使用多态的形式实现
public class Test {
    public static void main(String[] args) {
        //向下转型
        Animale a = new Cat();
        //强转Cat
        a.setAge(10);
        a.setName("小白");
        Cat c = (Cat)a;
        c.durk();
        c.eat();
        c.play();
        System.out.println(c.getName() + "," +c.getAge() + "岁，");

        //强转dog
        Animale a1 = new Dog();
        Dog d = (Dog)a1;
        d.durk();
        d.eat();
        d.look();
    }
}
