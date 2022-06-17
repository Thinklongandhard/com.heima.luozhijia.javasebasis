package JavaSEAdvance.com.luozhijia.day06.Demo11TreeSetTest;

import java.util.Random;
import java.util.TreeSet;

/**
 * @anthor longway
 * @create 2022-06-17
 * 18:12
 */

//需求： 产生10个不重复的随机数（1到20）
public class RandomTest {
    public static void main(String[] args) {
        //创建TreeSet集合
        TreeSet<Integer> ts = new TreeSet<Integer>();
        //创建随机数对象
        Random r = new Random();
        //判断集合的长度是不是小于10
        Random:while (true){
            if (ts.size()<10){
                //产生一个随机数存入集合
                int i = r.nextInt(20)+1;
                ts.add(i);
            }else{
                break Random;
            }
        }
        for (Integer i : ts){
            System.out.print(i +" ");
        }
    }
}
