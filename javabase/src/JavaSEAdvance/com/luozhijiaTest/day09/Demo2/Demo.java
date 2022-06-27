package JavaSEAdvance.com.luozhijiaTest.day09.Demo2;

import java.util.HashMap;
import java.util.Set;

/**
 * @anthor longway
 * @create 2022-06-21
 * 11:09
 */
/*
有以下字符串：
		String str = “fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew”;
	请编程统计每个字符出现的次数

 */
public class Demo {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        Set<Character> keySet = hm.keySet();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            Integer value = hm.get(key);
            if (value == null){   //说明不存在
                hm.put(key,1);
            }else {
                value++;
                hm.put(key,value);
            }
        }
        Set<Character> set = hm.keySet();
        for (Character c : set){
            System.out.print(c + "(" + hm.get(c) + ")");
        }
//        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
//        String line = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
//        for (int i = 0; i < line.length(); i++) {
//            //拿到每一个字符
//            char key = line.charAt(i);
//            Integer value = hm.get(key);
//            if (value == null){  //说明不存在
//                hm.put(key,1);
//            }else{
//                value++;
//                hm.put(key,value);
//            }
//        }
//        Set<Character> keySet = hm.keySet();
//        for (Character key : keySet){
//            Integer value = hm.get(key);
//            System.out.print(key + "(" + value + ")");
//        }
    }
}
