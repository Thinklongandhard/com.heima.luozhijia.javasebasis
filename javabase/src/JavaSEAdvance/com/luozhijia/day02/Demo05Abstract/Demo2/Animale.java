package JavaSEAdvance.com.luozhijia.day02.Demo05Abstract.Demo2;

/**
 * @anthor longway
 * @create 2022-06-15
 * 9:45
 */
//抽象类中可以有不抽象的方法
    //抽象方法必须放在抽象类
public abstract class Animale {
    public abstract void eat();

    public void sleep(){
        System.out.println("睡觉");
    }
}
