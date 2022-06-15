package JavaSEAdvance.com.luozhijia.day02.Demo02;

/**
 * @anthor longway
 * @create 2022-06-14
 * 20:13
 */
public class Cat extends Animale {
    /*
        1、有继承/实现关系
        2、有方法重写
        */

    public String name = "小十三";
    public int age = 5;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void show(){
        System.out.println("捕猎");
    }
}
