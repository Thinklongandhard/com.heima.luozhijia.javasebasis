package JavaSEAdvance.com.luozhijiaTest.day09.Demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @anthor longway
 * @create 2022-06-21
 * 10:47
 */
/*
	定义一个：键Integer，值String类型的HashMap集合
	存储以下数据：
1，”张三”
2，“李四”
1，“王五”
	打印集合大小；
	使用“键找值”的方式遍历集合，打印键和值；
	使用“键值对”的方式遍历集合，打印键和值；
	获取键为1的值，并打印
	获取键为10的值，并打印
	判断集合中是否有键：10
	删除键为1的键值对，删除完毕打印集合

 */
public class Demo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"张三");
        hm.put(2,"李四");
        hm.put(3,"王五");
        System.out.println(hm.size());
        //键找值
        Set<Integer> keySet = hm.keySet();
        for (Integer it : keySet){
            System.out.print(it + "," + hm.get(it) + " ");
        }
        //键值对
        Set<Map.Entry<Integer, String>> set = hm.entrySet();
        for (Map.Entry<Integer, String> me : set){
            System.out.print(me.getKey() + "," + me.getValue() + " ");
        }
        System.out.println();
        System.out.println("-------------");
        //获取键为1的值，并打印
        for (Integer it : keySet){
            if (it == 1){
                System.out.print(it + "," + hm.get(it) + " ");
            }
            if (it == 10){
                System.out.print(it + "," + hm.get(it) + " ");
            }else{
                System.out.println("没有10的键");
            }
        }
        //删除键为1的键值对，删除完毕打印集合
        hm.remove(1);
        for (Integer it : keySet){
            System.out.print(it + "," + hm.get(it) + " ");
        }
    }
}
