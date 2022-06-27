package JavaSEAdvance.com.luozhijia.day14.Demo1;

/**
 * @anthor longway
 * @create 2022-06-26
 * 20:05
 */
public class Test {
    public static void main(String[] args) {
        //函数式接口调用
        Demo d = () -> {System.out.println("函数式接口");};
        d.show();
    }
}
