package JavaSEAdvance.com.luozhijia.day07.MapDemo2;

import java.util.HashMap;
import java.util.Map;

/**
 * @anthor longway
 * @create 2022-06-18
 * 10:25
 */
/*
        V put(K key,V value)
		  //添加元素
		V remove(Obbject key)
		  //根据键删除键值对元素
		void clear()
		  //移出所有的键值对元素
		boolean containsKey(Object key)
		  //判断集合是否包含指定的键
		boolean containsValue(Object value)
		  //判断集合是否包含指定的值
		boolean isEmpty()
		  //判断集合是否为空
		int size()
		  //集合的长度，也就是集合中键值对的个数
 */
public class MapMuthod {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        //V put(K key,V value)
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

        //System.out.println(map);

        //V remove(Obbject key)
//        String s = map.remove("郭xiang");  //null没有键对应的值就返回null
//        System.out.println(map);
//        System.out.println(s);
//        map.clear();
//        System.out.println(map);

//        boolean key = map.containsKey("郭靖");
//        System.out.println(key);
//
//        boolean b = map.containsValue("黄蓉");
//        System.out.println(b);

        //boolean isEmpty()
        boolean empty = map.isEmpty();
        System.out.println(empty);

        int size = map.size();
        System.out.println(size);

    }
}
