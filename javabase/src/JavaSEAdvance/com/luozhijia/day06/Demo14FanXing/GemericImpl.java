package JavaSEAdvance.com.luozhijia.day06.Demo14FanXing;

/**
 * @anthor longway
 * @create 2022-06-17
 * 20:27
 */
public class GemericImpl<T> implements GenericTest<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
