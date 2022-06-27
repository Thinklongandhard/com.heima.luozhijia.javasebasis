package JavaSEAdvance.com.luozhijia.day13.Demo4;

/**
 * @anthor longway
 * @create 2022-06-25
 * 11:48
 */
public class Demo {
    public static void main(String[] args) {
//        useConverter((s) -> {
//            return Integer.parseInt(s);
//        });
//        useConverter(s -> Integer.parseInt(s));

        //引用类方法
        useConverter(Integer::parseInt);
        //lambda表达式被类方法替代的时候，它的形式参数全部传递给静态方法作为参数

    }
    public static void useConverter(Converter c){
        int num = c.convert("666");
        System.out.println(num);
    }
}
