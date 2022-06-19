package JavaSEAdvance.com.luozhijia.day07.MapDemo3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @anthor longway
 * @create 2022-06-18
 * 10:36
 */
//Map集合的获取元素的方法

//    Map集合的获取功能
//            V get(Object key)
//            //根据键获取值
//            Set<K> keySet()
//        //获取所有键的集合   //因为键一定是唯一的所以会返回一个Set集合
//        Collection<V> values()
////获取所有值的集合   //因为没有明确说明value的值会不会重复，所以用Collection集合
public class MapMuthodIn {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        //V put(K key,V value)
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

        //V get(Object key)
        //String s = map.get("张无忌");  //赵敏
        //String s = map.get("张wu");  //null
        //System.out.println(s);

        //Set<K> keySet()
//        Set<String> set = map.keySet();
//        //返回集合中所有的键
//        System.out.println(set);

        //Collection<V> values()
        Collection<String> values = map.values(); //[小龙女, 黄蓉, 赵敏]
        //返回集合中所有对应的值
        System.out.println(values);


    }
}
