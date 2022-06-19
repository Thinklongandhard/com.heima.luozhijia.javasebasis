package JavaSEAdvance.com.luozhijia.day07.MapDemo7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @anthor longway
 * @create 2022-06-18
 * 15:28
 */
//需求：
    //创建一个ArrayList集合，存储三个元素，每一个元素都是HashMap,
    // 每一个HashMap的键和值都是String类型，并遍历
public class Test {
    public static void main(String[] args) {
        //创建一个HashMap集合
        HashMap<String,String> hm1 = new HashMap<String,String>();
        HashMap<String,String> hm2 = new HashMap<String,String>();
        HashMap<String,String> hm3 = new HashMap<String,String>();
        hm1.put("2019","llll");
        hm2.put("2022","aaaa");
        hm3.put("2020","bbbb");
        //创建一个ArrayList集合
        ArrayList<HashMap<String,String>> al = new ArrayList<HashMap<String,String>>();
        al.add(hm1);
        al.add(hm2);
        al.add(hm3);

        //遍历
        for(HashMap<String,String> h : al){
            Set<String> keySet = h.keySet();
            for(String key : keySet){
                String value = h.get(key);
                System.out.println(key + "," + value);
            }
        }
    }
}
