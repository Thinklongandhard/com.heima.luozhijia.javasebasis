package JavaSEAdvance.com.luozhijia.day14.Demo5;

import java.util.function.Consumer;

/**
 * @anthor longway
 * @create 2022-06-27
 * 11:12
 */
public class Demo {
    public static void main(String[] args) {
        String[] strArray = {"林青霞,30","张曼玉,35","王祖贤,33"};
//        ConumserTset(strArray,(str) ->{
//            String name = str.split(",")[0];
//            System.out.print("姓名：" + name);
//        },(str) -> {
//            String age = str.split(",")[1];
//            System.out.println(",年龄：" + age);
//        });
//
        ConumserTset(strArray, str -> System.out.print("姓名: " + str.split(",")[0]),
                str -> System.out.println("，年龄" + Integer.parseInt(str.split(",")[1])));
        }
    private static void ConumserTset(String[] arr, Consumer<String> con1, Consumer<String> con2){
        for (String s : arr){
            //将两个进行连接然后一起消费
            con1.andThen(con2).accept(s);
        }
    }
}
