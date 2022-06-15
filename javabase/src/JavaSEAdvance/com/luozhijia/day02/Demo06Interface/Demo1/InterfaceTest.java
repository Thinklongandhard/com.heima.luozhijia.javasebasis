package JavaSEAdvance.com.luozhijia.day02.Demo06Interface.Demo1;

/**
 * @anthor longway
 * @create 2022-06-15
 * 11:21
 */
public class InterfaceTest {
    //接口的实例化也需要使用多态的方式
    public static void main(String[] args) {
        Jumpping j = new Fish();
        j.Jump();
    }
}
