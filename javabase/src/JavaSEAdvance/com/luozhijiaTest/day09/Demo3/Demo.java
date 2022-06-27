package JavaSEAdvance.com.luozhijiaTest.day09.Demo3;

/**
 * @anthor longway
 * @create 2022-06-21
 * 11:28
 */
/*
请按以下要求顺序编写程序：
	定义测试类，定义main()方法；
	定义以下数组：
int[] arr = {1,2,432,32,54,32,3,7,657,563,25,43,6,463,52};
	用Arrays类打印此数组的所有元素；
	用“冒泡排序”对数组元素“升序”排序；打印排序后的数组。

 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,432,32,54,32,3,7,657,563,25,43,6,463,52};
        Arrays a = new Arrays();
        a.show(arr);
    }
}
