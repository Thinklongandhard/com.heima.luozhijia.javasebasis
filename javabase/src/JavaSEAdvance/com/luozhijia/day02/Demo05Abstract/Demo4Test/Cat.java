package JavaSEAdvance.com.luozhijia.day02.Demo05Abstract.Demo4Test;

/**
 * @anthor longway
 * @create 2022-06-15
 * 10:57
 */
public class Cat extends Animale{
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
    public void show1(){
        Animale a = new Animale(18,"小白") {
            @Override
            public void eat() {
                System.out.println("chi");
            }
        };
        a.show();
    }

    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }
}
