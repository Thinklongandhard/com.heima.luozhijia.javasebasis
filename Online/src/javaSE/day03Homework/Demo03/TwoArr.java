package javaSE.day03Homework.Demo03;

/**
 * @anthor longway
 * @create 2022-06-14
 * 20:46
 */

/*
已知数组int[] nums = {5,10,15},,要求创建一个新数组
        1.新数组的长度和已知数组相同
        2.新数组每个元素的值 是已知数组对应位置元素的2倍
        3.在控制台中打印新数组的所有元素
*/
public class TwoArr {
    public static void main(String[] args) {
        int[] nums = new int[]{5,10,15};
        int[] newnums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newnums[i] = nums[i]*2;
        }
        System.out.print("[");
        for (int i = 0; i < newnums.length; i++) {
            if (i == newnums.length-1){
                System.out.print(newnums[i]);
            }else {
                System.out.print(newnums[i] + ",");
            }
        }
        System.out.print("]");
    }
}
