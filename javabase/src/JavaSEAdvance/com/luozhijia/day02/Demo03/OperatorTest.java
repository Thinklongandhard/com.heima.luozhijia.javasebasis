package JavaSEAdvance.com.luozhijia.day02.Demo03;

/**
 * @anthor longway
 * @create 2022-06-15
 * 8:02
 */
public class OperatorTest {
    public static void main(String[] args) {
        //创建动物操作类对象，调用方法
        AnimaleIOperator a = new AnimaleIOperator();
        //创建Cat对象
        Cat c = new Cat();
        a.useAnimale(c);

        //调用新的方法
        Dognew d = new Dognew();
        a.useAnimale(d);

    }
}
