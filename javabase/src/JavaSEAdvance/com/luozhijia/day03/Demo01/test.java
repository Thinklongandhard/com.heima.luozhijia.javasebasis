package JavaSEAdvance.com.luozhijia.day03.Demo01;

/**
 * @anthor longway
 * @create 2022-06-15
 * 15:35
 */
public class test {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.show1();

        Outer.demo d = new Outer().new demo();
        d.show();
    }
}
