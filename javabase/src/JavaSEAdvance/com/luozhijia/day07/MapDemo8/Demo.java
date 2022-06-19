package JavaSEAdvance.com.luozhijia.day07.MapDemo8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @anthor longway
 * @create 2022-06-18
 * 15:47
 */
//需求：创建一个HashMap集合，存储三个元素，键是String类型，值是ArrayList，每一个ArrayList都是String类型的
public class Demo {
    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
        //创建ArrayList集合
        ArrayList<String> al1 = new ArrayList<String>();
        //添加元素
        al1.add("aaaa");
        al1.add("cccc");
        ArrayList<String> al2 = new ArrayList<String>();
        //添加元素
        al2.add("oooo");
        al2.add("xiao");
        ArrayList<String> al3 = new ArrayList<String>();
        //添加元素
        al3.add("zhij");
        al3.add("lypi");
        //将ArrayList存入HashMap
        hm.put("2001",al1);
        hm.put("2054",al2);
        hm.put("2020",al3);

        //遍历集合
        //获取所有key
//        Set<String> keySet = hm.keySet();
//        for (String key : keySet){
//            for (String value : hm.get(key)){
//                String[] strings = value.split(key);
//                for (int i = 0; i < strings.length; i++) {
//                    System.out.println(strings[i] + " " + key);
//                }
//            }
//        }
        Set<String> keySet = hm.keySet();
        for (String key : keySet){
            ArrayList<String> value = hm.get(key);
            System.out.println();
            System.out.println(key);
            for(String s : value){
                System.out.print(s + " ");
            }

        }
    }
}
