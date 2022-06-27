package JavaSEAdvance.com.luozhijia.day14.Demo4;

import java.util.function.Consumer;

/**
 * @anthor longway
 * @create 2022-06-27
 * 8:47
 */
public class ConsumerTest {
    public static void main(String[] args) {
//        getConsumer("李垚坪",(name) -> {
//            //直接输出字符串
//            System.out.println(name);
//        });
        //优化
//        getConsumer("李垚坪",(name) -> {
//            //进行反转，然后输出
//            String s = new StringBuilder(name).reverse().toString();
//            System.out.println(s);
//        });
        //优化
        getConsumer("李垚坪",(name) -> System.out.println(new StringBuilder(name).reverse().toString()));
        System.out.println("----------");

        //getConsumers方法
        getConsumers("李垚坪",(name) -> System.out.println(name), name -> System.out.println(new StringBuilder(name).reverse().toString()));
    }
    private static void getConsumers(String name,Consumer<String> con1,Consumer<String> con2){
        //两个方法
        con1.accept(name);
        con2.accept(name);
    }
    private static void getConsumer(String name, Consumer<String> con){
        //具体实现通过Lambda表达式
        con.accept(name);
    }
}
