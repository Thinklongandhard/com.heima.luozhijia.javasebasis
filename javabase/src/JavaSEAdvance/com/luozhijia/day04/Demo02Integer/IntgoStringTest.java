package JavaSEAdvance.com.luozhijia.day04.Demo02Integer;

import java.util.Arrays;

/**
 * @anthor longway
 * @create 2022-06-15
 * 21:37
 */
//需求
    //有一个字符串：“91 27 46 38 50”
    //编写程序实现最终输出结果是“27 38 46 50 91”
public class IntgoStringTest {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        //使用split方法
        String[] strings = new String[5];
        strings = s.split(" ");
        //把String类型转换为Int类型
        int[] num = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            num[i] = Integer.parseInt(strings[i]);
        }
        //排序
        Arrays.sort(num);
        //拼接元素
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            if (i == num.length-1){
                sb.append(num[i]);
            }else{
                sb.append(num[i]).append(" ");
            }
        }
        String result = sb.toString();

        System.out.println("result:" + result);

    }
}
