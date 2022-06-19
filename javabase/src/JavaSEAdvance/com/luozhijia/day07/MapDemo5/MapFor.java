package JavaSEAdvance.com.luozhijia.day07.MapDemo5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @anthor longway
 * @create 2022-06-18
 * 11:21
 */
public class MapFor {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        //V put(K key,V value)
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

        /*
        遍历方法：
		    1、获取所有键值对对象的集合
			    Set<Map.Entry<K,V>>entrySet(): 获取所有键值对对象的集合
			2、遍历键值对对象的集合，得到每一个键值对对象
			    用增强for实现，得到每一个Map.Entry
         */
        //1、获取所有键值对对象的集合
        Set<Map.Entry<String,String>> set = map.entrySet();
        //2、遍历键值对对象的集合，得到每一个键值对对象
        for (Map.Entry<String, String> s : set){
            System.out.println(s.getKey() + "," + s.getValue());
        }
    }
}
