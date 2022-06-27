package JavaSEAdvance.com.luozhijia.day14.Demo4;

import java.util.function.Supplier;

/**
 * @anthor longway
 * @create 2022-06-27
 * 8:25
 */
public class SupplierTest {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {13,56,32,154,35};
        int maxvalue = getMax(() -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(maxvalue);
    }
    private static int getMax(Supplier<Integer> sup){
        //返回一个数组中的最大值
        return sup.get();
        //具体的函数实现要靠Lambda表达式来实现
    }
}
