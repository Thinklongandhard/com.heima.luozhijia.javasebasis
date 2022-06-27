package JavaSEAdvance.com.luozhijiaTest.day10.Demo1;

/**
 * @anthor longway
 * @create 2022-06-21
 * 11:57
 */
public class Arrays {
    public void show(int[] arr){
        //冒泡排序  //升序
        int start = 0;
        int min;
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
        System.out.println();
        //降序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                min = arr[i];
                if (min > arr[j]){
                    arr[i] = arr[j];
                    arr[j] = min;
                }
            }
        }
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
