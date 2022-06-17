package JavaSEAdvance.com.luozhijia.day04.Demo03;

/**
 * @anthor longway
 * @create 2022-06-16
 * 8:03
 */

 /*        装箱： 把基本数据类型转换为对应的包装类类型
           拆箱： 把包装类类型转换为对应的基本数据类型
           */
public class IntegerDemo3 {
    public static void main(String[] args) {
        //装箱： 把基本数据类型转换为对应的包装类类型
        //调方法的手动装箱
        Integer value = Integer.valueOf(100);
        //自动装箱
        Integer ii = 100; //底层也是Integer.valueOf()

        //拆箱:  ii.intValue()
        ii = ii.intValue() + 200;
        //自动拆箱
        ii += 200; //自动拆箱和装箱

        Integer iii = null;
        //在开发中遇到引用数据类型的包装类操作，
        //最好先判断是否为空
        //iii += 300;  //NullPointerException
        //iii先调用方法进行拆箱操作
        //因为iii为null，所以没办法拆箱，产生错误
        if (iii != null){
            iii += 300;  //NullPointerException

        }
    }
}
