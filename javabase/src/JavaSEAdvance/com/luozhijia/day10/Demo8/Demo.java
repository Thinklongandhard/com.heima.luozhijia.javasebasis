package JavaSEAdvance.com.luozhijia.day10.Demo8;

import java.util.Properties;
import java.util.Set;

/**
 * @anthor longway
 * @create 2022-06-22
 * 15:59
 */
public class Demo {
    public static void main(String[] args) {
        //创建结合对象
        Properties pro = new Properties();

        //添加元素
        /*
        public synchronized Object setProperty(String key, String value) {
            return put(key, value);
        }
        public synchronized V put(K key, V value) {
        // Make sure the value is not null
        if (value == null) {
            throw new NullPointerException();
        }
         */
        pro.setProperty("982","liu");
        pro.setProperty("687","wuh");
        pro.setProperty("895","hhh");

//        System.out.println(pro.getProperty("982"));
//        System.out.println(pro.getProperty("132131"));  //null


        //Set<String>stringPropertyNames()
        //从该属性列表中返回一个不可修改的键集，其中键及其对应的值
        //是字符串
        Set<String> keySet = pro.stringPropertyNames();  //获取String类型的键返回值
        for (String key : keySet){
            String value = pro.getProperty(key);
            System.out.println(key + "," + value);

        }


    }
}
