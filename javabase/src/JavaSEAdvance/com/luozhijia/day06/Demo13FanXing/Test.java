package JavaSEAdvance.com.luozhijia.day06.Demo13FanXing;

/**
 * @anthor longway
 * @create 2022-06-17
 * 20:10
 */
public class Test {
    public static void main(String[] args) {
//        Demo13<String> d = new Demo13<String>();
//        d.show("xxx");
//        Demo13<Integer> d1 = new Demo13<Integer>();
//        d1.show(100);

        //泛型方法
        Demo13 d = new Demo13();
        d.show("hellp");
        d.show(100);
        d.show('c');
    }
}
