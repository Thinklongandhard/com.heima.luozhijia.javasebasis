package JavaSEAdvance.com.luozhijia.day04.Demo02Integer.Test;

/**
 * @anthor longway
 * @create 2022-06-16
 * 7:48
 */
//需求
//有一个字符串：“91 27 46 38 50”
//编写程序实现最终输出结果是“27 38 46 50 91”
public class ontTest {
    public static void main(String[] args){
        Ont o = new Ont();
        //新建一个字符串
        String s = "91 27 46 38 50";
        //调用方法
        String show = o.show(s);
        System.out.println(show);
    }
}
