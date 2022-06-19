package JavaSEAdvance.com.luozhijia.day06.Demo14FanXing;

/**
 * @anthor longway
 * @create 2022-06-17
 * 20:27
 */
public class Test {
    public static void main(String[] args) {
        //泛型接口
        GemericImpl<String> g = new GemericImpl<String>();
        g.show("hello");

        GemericImpl<Integer> i = new GemericImpl<Integer>();
        i.show(30);
    }
}
