package JavaSEAdvance.com.luozhijia.day02.Demo04;

import JavaSEAdvance.com.luozhijia.day02.Demo03.Animale;

/**
 * @anthor longway
 * @create 2022-06-15
 * 8:33
 */
public class Cat extends Animale {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void paly(){
        System.out.println("猫薄荷");
    }
}
