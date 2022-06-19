package JavaSEAdvance.com.luozhijia.day06.Demo15FanXing;

import java.util.ArrayList;
import java.util.List;

/**
 * @anthor longway
 * @create 2022-06-18
 * 8:01
 */
//演示类型通配符
     //标准类型通配符
    //规定了上限的类型通配符
    //规定了下限的类型通配符
public class TongPeiFu {
    public static void main(String[] args) {
        //创建对象
        //标准类型通配符   标准通配符可以传入任意类型参数
        List<?> list = new ArrayList<Object>();
        List<?> list1 = new ArrayList<Number>();
        List<?> list2 = new ArrayList<Integer>();
        List<?> list3 = new ArrayList<String>();

        //规定上限的类型通配符
        //List<? extends Number> list4 = new ArrayList<Object>();
        // 已经规定了上限最高到Number类型，Object是Number类型的父类，所以无法创建对象
        List<? extends Number> list4 = new ArrayList<Number>();
        List<? extends Number> list5 = new ArrayList<Integer>();

        //规定下限的类型通配符
        List<? super Number> list6 = new ArrayList<Object>();
        List<? super Number> list7 = new ArrayList<Number>();
        //List<? super Number> list8 = new ArrayList<Integer>();
        //已经规定了下限，最低实现类到Number,Number的子类无法作为传入参数

    }
}
