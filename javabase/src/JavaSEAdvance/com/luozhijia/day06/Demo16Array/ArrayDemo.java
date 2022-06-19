package JavaSEAdvance.com.luozhijia.day06.Demo16Array;

/**
 * @anthor longway
 * @create 2022-06-18
 * 9:22
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //可变参数练习
        System.out.println(Sum("liu",30));
        System.out.println(Sum("aaa",30,20));
        System.out.println(Sum("bbb",30,30,40));
        System.out.println(Sum("ccc",30,50,60,90));
        System.out.println(Sum("ddd",30,60,70,60,70));
    }

//    public static int Sum(int... a){  //这里这个a其实是一个数组
//        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//        }
//        return sum;
//    }


    //如果需要传入的参数不止可变长参数一种，那么可变长参数要放在最后面
//    public static int Sum(int b,int... a){
//        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//        }
//        return sum;
//    }

    public static int Sum(String name,int... a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

        }
        return sum;
    }

}
