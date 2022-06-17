package JavaSEAdvance.com.luozhijia.day04.Demo01Integer;

/**
 * @anthor longway
 * @create 2022-06-15
 * 21:24
 */
//int 和 string类型之间的相互转换
public class IntgoString {
    public static void main(String[] args){
        //给int赋值
        int num = 100;
        //第一种
        String s = "" + num;
        System.out.println(s);
        System.out.println("----------");

        //第二种
        //public static String valueOf(int i)
        String s2 = String.valueOf(num);
        System.out.println(s2);
        System.out.println("-----------");

        //String转为int
        String num1 = "100";
        //方式一
        //通过Integer这个桥梁
        Integer i = Integer.valueOf(num1);
        //把Integer转为int类型
        //public static intValue()
        int num2 = i.intValue();
        System.out.println(num2);
        System.out.println("------------");

        //方式2
        //String直接int
        //public static int parseInt(String s)
        int y = Integer.parseInt(num1);
        System.out.println(y);
    }
}
