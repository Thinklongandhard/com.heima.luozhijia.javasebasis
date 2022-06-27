package JavaSEAdvance.com.luozhijiaTest.day10.Demo2;

/**
 * @anthor longway
 * @create 2022-06-21
 * 14:16
 */
/*
请定义main()方法，在main()中定义以下数组：
	int[] arr = {431,54,25,25,26,45,2,4,65,3,64,6,46,7,54};
	使用冒泡排序对元素进行排序；
	排序后，使用二分法查找元素：2，并打印查询结果；
	再使用二分法查找200，并打印查找结果；
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {431,54,25,25,26,45,2,4,65,3,64,6,46,7,54};
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                num = arr[i];
                if (num < arr[j]){
                    arr[i] = arr[j];
                    arr[j] = num;
                }
            }
        }
        for (int i : arr){
            System.out.println(i);
        }
    }
}
