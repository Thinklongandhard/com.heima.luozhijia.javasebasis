package JavaSEAdvance.com.luozhijiaTest.day15.Demo4;

/**
 * @anthor longway
 * @create 2022-06-28
 * 19:00
 */
//请使用递归计算从1--100的所有数的累加和。
public class Demo {
    public static void main(String[] args) {
        System.out.println(show(100));
    }
    public static int show(int n){
        //给定终止条件
        if (n == 1){
            return 1;
        }
        return n + show(--n);
    }
}
