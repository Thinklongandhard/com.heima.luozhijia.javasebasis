package JavaSEAdvance.com.luozhijiaTest.day01.Demo6Gai;

import java.util.ArrayList;
import java.util.Random;

/**
 * @anthor longway
 * @create 2022-06-20
 * 10:38
 */
//需求分析：
    //创建一个ArrayList集合方法，和一个返回int类型随机数的方法
    //在方法中进行遍历，集合传入一个参数，使用contains方法获取返回值（true/false）
    //在随机数方法中调用此集合
    //如果返回true,说明包含此元素，continue退出本次循环，
    //如果返回false，添加元素到集合中

public class Demo {
    public static void main(String[] args) {
        //键盘接受一个集合大小
        ArrayList<Integer> arrays = Arrays();
        for (int i = 0; i < arrays.size(); i++) {
            Integer integer = arrays.get(i);
            System.out.print(integer + " ");
        }
    }

    //创建一个ArrayList集合
    public static ArrayList<Integer> Arrays() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random r = new Random();
        int num = 0;
        for (int i = 1;i < 2;i--){
            int random = r.nextInt(5);
            if (!(arr.contains(random))) {
                arr.add(random);
                num++;
            }else if (num == 5){
                break;
            }
        }
        return arr;
    }
}

