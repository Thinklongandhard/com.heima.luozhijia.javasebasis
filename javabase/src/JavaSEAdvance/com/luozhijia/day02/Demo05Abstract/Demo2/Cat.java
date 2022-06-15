package JavaSEAdvance.com.luozhijia.day02.Demo05Abstract.Demo2;

/**
 * @anthor longway
 * @create 2022-06-15
 * 9:47
 */
public class Cat extends Animale {
    //抽象类的继承必须实现抽象方法
    @Override
    public void eat() {
        System.out.println("吃");
    }

}
