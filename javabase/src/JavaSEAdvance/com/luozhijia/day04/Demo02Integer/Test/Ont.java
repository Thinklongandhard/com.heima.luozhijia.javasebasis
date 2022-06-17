package JavaSEAdvance.com.luozhijia.day04.Demo02Integer.Test;

import java.util.Arrays;

/**
 * @anthor longway
 * @create 2022-06-16
 * 7:49
 */
public class Ont {
    public String show(String s){
        //拿到一个字符串
        String[] s1 = new String[5];
        //把字符串分割开
        s1 = s.split(" ");
        //转为int类型
        int[] num = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            num[i] = Integer.parseInt(s1[i]);
        }
        //排序
        Arrays.sort(num);
        //拼接字符串
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            if (i == num.length-1){
                sb.append(num[i]);
            }else{
                sb.append(num[i]).append(" ");
            }
        }
        String end = sb.toString();
        return end;
    }
}
