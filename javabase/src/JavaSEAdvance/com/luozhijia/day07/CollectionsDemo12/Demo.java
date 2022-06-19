package JavaSEAdvance.com.luozhijia.day07.CollectionsDemo12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @anthor longway
 * @create 2022-06-18
 * 18:43
 */
/*
   思路：
      创建一个集合对象，ArrayList
      在集合中存储数据
      洗牌： 把牌打散
      发牌： 遍历结合给三个玩家发牌
      看牌： 三个玩家分别遍历集合
 */
public class Demo {
    public static void main(String[] args) {
        //创建牌盒
        ArrayList<String> paihes = new ArrayList<String>();
        //存储对象
        /*
          ♦2，♦3....♦k，♦A
          ♣2....♣A
          ♥2....♥A
          ♠2....♠A
         */
        String[] colors = new String[]{"♦","♣","♥","♠"};
        String[] num = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (String color : colors){
            for (String number : num){
                String poke = color+number;
                paihes.add(poke);
            }
        }
        paihes.add("大王");
        paihes.add("小王");


        //洗牌： 把牌打散
        Collections.shuffle(paihes);


        //发牌： 遍历结合给三个玩家发牌
        //三个集合
        ArrayList<String> lxarray = new ArrayList<String>();
        ArrayList<String> ljarray = new ArrayList<String>();
        ArrayList<String> ararray = new ArrayList<String>();
        ArrayList<String> dparray = new ArrayList<String>();

        for (int i = 0; i < paihes.size(); i++) {
            String poke = paihes.get(i);

            if (i-paihes.size() == -3){
                dparray.add(poke);
            }else if (i%3==0){
                lxarray.add(poke);
            }else if (i%3==1){
                ljarray.add(poke);
            }else if (i%3==2){
                ararray.add(poke);
            }
        }
        //排序
        Collections.sort(lxarray, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int num = s1.compareTo(s2);
                return num;
            }
        });

        System.out.println(lxarray);
        System.out.println(ljarray);
        System.out.println(ararray);
        System.out.println(dparray);
    }
}
