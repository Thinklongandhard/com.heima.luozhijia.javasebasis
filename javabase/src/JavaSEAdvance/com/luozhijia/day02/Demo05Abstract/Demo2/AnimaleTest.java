package JavaSEAdvance.com.luozhijia.day02.Demo05Abstract.Demo2;

/**
 * @anthor longway
 * @create 2022-06-15
 * 9:47
 */
public class AnimaleTest {
    public static void main(String[] args) {
        //创建Animale对象
        //Animale a = new Animale();   抽象类对象的创建必须使用多态的形式

        //eg :
        Animale a = new Cat();  //使用多态的向上转型
        a.eat();
        a.sleep();

    }
}
