package JavaSEAdvance.com.luozhijia.day03.Demo05Math;

/**
 * @anthor longway
 * @create 2022-06-15
 * 16:45
 */
/*常用方法：
        1、public static int abs(int a)      //返回参数的绝对值
        2、public static double ceil(double a)        //返回大于或等于参数的最小double值，等于一个整数
        3、public static double floor(double a)       //返回小于或等于参数的最大double值，等于一个整数
        4、public static int round(float a)        //按照四舍五入返回最接近参数的int
        5、public static int max(int a,int b)        //返回两int值中的较大值
        6、public static int min(int a,int b)        //返回两int值中的较小值
        7、public static dpuble pow(double a,double b)        //返回a的b次幂的值
        8、public static double random()        //返回值为double的正值，[0.0,1.0)
        */
public class MathDemo {
    public static void main(String[] args) {
        //1、public static int abs(int a)      //返回参数的绝对值
        System.out.println(Math.abs(-2));
        System.out.println("--------------");
        //2、public static double ceil(double a)        //返回大于或等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(2.9));
        //3、public static double floor(double a)       //返回小于或等于参数的最大double值，等于一个整数
        System.out.println(Math.floor(2.9));
        System.out.println("--------------");
        //4、public static int round(float a)        //按照四舍五入返回最接近参数的int
        System.out.println(Math.round(2.9));
        System.out.println(Math.round(1111.6));
        System.out.println("--------------");
        //5、public static int max(int a,int b)        //返回两int值中的较大值
        System.out.println(Math.max(7,8));
        //6、public static int min(int a,int b)        //返回两int值中的较小值
        System.out.println(Math.min(7,8));
        System.out.println("--------------");
        //7、public static dpuble pow(double a,double b)        //返回a的b次幂的值
        System.out.println(Math.pow(2.0,4.0));
        System.out.println("--------------");
        //8、public static double random()        //返回值为double的正值，[0.0,1.0)  随机数
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));
    }
}
