package JavaSEAdvance.com.luozhijiaTest.day09.Demo3;

/**
 * @anthor longway
 * @create 2022-06-21
 * 11:32
 */
/*
    用Arrays类打印此数组的所有元素；
	用“冒泡排序”对数组元素“升序”排序；打印排序后的数组。
 */
public class Arrays {
    public void show(int[] arr){
        //冒泡排序
        int start = 0;
        int end = arr.length-1;
        int max ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-start; j++) {
                max = arr[i];
                if (max < arr[j]){
                    max = arr[j];
                    arr[j] = arr[i];
                    arr[i] = max;
                }
            }
        }
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
