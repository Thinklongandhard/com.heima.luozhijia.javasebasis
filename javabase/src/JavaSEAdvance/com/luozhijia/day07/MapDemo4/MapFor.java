package JavaSEAdvance.com.luozhijia.day07.MapDemo4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @anthor longway
 * @create 2022-06-18
 * 11:02
 */
//遍历集合
public class MapFor {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        //V put(K key,V value)
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

        /*
        遍历方法：
		    1、获取所有键的集合，用keySet()方法去实现
			2、遍历键的集合，获取到每一个键，用增强for实现
			3、根据键去找值，用get(Object key)方法实现
         */

        //1.获取所有键的集合，用keySet()方法去实现
        Set<String> set = map.keySet();

        //2、遍历键的集合，获取到每一个键，用增强for实现
        for(String s : set){
            //3、根据键去找值，用get(Object key)方法实现
            String value = map.get(s);
            System.out.println(value);
        }
    }
}
