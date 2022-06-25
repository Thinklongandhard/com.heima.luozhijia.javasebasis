package JavaSEAdvance.com.luozhijia.day10.Demo7;

import java.util.Properties;
import java.util.Set;

/**
 * @anthor longway
 * @create 2022-06-22
 * 15:48
 */
public class Demo {
    public static void main(String[] args) {
        //properties练习
        Properties pro = new Properties();  //虽然Properties是一个map集合，但是他不能规范泛型
        //添加元素
        pro.put("123548","liu");
        pro.put("46546","hu");
        pro.put("31565","zhe");
        pro.put("321548","gue");

        //获取所有键
        Set<Object> keySet = pro.keySet();   //因为没有规定泛型，所有默认是Object类型
        //遍历
        for (Object o : keySet){
            System.out.println(o + "," + pro.get(o));
        }
    }
}
