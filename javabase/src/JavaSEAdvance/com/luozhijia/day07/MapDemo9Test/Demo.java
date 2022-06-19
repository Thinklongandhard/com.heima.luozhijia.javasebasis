package JavaSEAdvance.com.luozhijia.day07.MapDemo9Test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @anthor longway
 * @create 2022-06-18
 * 16:17
 */
//需求：键盘录入一个字符串，要求统计字符串中每个字符串出现的次数
    //我们可以把结果分成几个部分来看
    //每一个部分可以看成是字符串和字符对象的次数组成
public class Demo {
    public static void main(String[] args) {
        //创建HashMap
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //接受一个字符串
        String line = sc.nextLine();
        for (int i = 0; i < line.length(); i++) {
            //拿到每一个字符
            char key = line.charAt(i);
            Integer value = hm.get(key);
            if (value == null){  //说明不存在
                hm.put(key,1);
            }else{
                value++;
                hm.put(key,value);
            }
        }
        //遍历
        //拿到所有的键
        Set<Character> keySet = hm.keySet();
        for (Character key : keySet){
            Integer value = hm.get(key);
            System.out.println(key + "(" + value + ")");
        }
    }
}
