package JavaSEAdvance.com.luozhijiaTest.day15.Demo3;

/**
 * @anthor longway
 * @create 2022-06-28
 * 18:47
 */
/*
请使用递归计算5的阶乘
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(show(5));
    }

    public static int show(int n) {
        //设置终止条件
        if (n == 1){
            return 1;
        }
        //递归调用
        return n * show(--n);
    }
}
