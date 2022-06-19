package JavaSEAdvance.com.luozhijia.day07.CollectionsDemo13;

import java.util.*;

/**
 * @anthor longway
 * @create 2022-06-18
 * 19:30
 */
//思路分析
//创建HashMap集合作为牌盒，键从0-->54值是String类型的数据
    //创建ArrayList集合存储键
    //定义花色数组和数字数组
    //拼接字符串讲牌作为值存入HashSet中，同时将键存入ArrayList集合
    //洗牌
    //定义TreeSet集合作为收牌对象
    //看牌
public class Demo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        //定义ArrayList集合
        ArrayList<Integer> al = new ArrayList<Integer>();
        //定义花色数组
        String[] colors = new String[]{"♦","♣","♠","♥"};
        String[] Number = new String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        //存储
        int key = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < Number.length; j++) {
                String s = colors[i] + Number[j];
                hm.put(key,s);
                al.add(key);
                key++;
            }
        }
        hm.put(key,"大王");
        al.add(key);
        key++;
        hm.put(key,"小王");
        al.add(key);
        //洗牌
        Collections.shuffle(al);
        //发牌
//        //遍历
//        Set<Map.Entry<Integer, String>> entries = hm.entrySet();
//        for (Map.Entry<Integer, String> me : entries){
//            Integer key1 = me.getKey();
//            String value = me.getValue();
//            System.out.println(key1 + "," + value);
//        }
        TreeSet<Integer> ts1 = new TreeSet<Integer>();
        TreeSet<Integer> ts2 = new TreeSet<Integer>();
        TreeSet<Integer> ts3 = new TreeSet<Integer>();
        TreeSet<Integer> dp = new TreeSet<Integer>();

        for (int i = 0; i < al.size(); i++) {
            if (i-al.size() >= -3){
                dp.add(al.get(i));
            }else if (i%3 == 0){
                ts1.add(al.get(i));
            }else if (i%3 == 1){
                ts2.add(al.get(i));
            }else if (i%3 == 2){
                ts3.add(al.get(i));
            }
        }
        lookpoke(ts1,hm);
        System.out.println();
        lookpoke(ts2,hm);
        System.out.println();
        lookpoke(ts3,hm);
        System.out.println();
        lookpoke(dp,hm);
    }

    //定义看牌方法
    public static void lookpoke(TreeSet<Integer> ts,HashMap<Integer,String> hm){
        for (Integer key : ts){
            String value = hm.get(key);
            System.out.print(value + " ");
        }
    }
}
