package JavaSEAdvance.com.luozhijia.day03.Demo06;

/**
 * @anthor longway
 * @create 2022-06-15
 * 17:53
 */
//实现冒泡排序
public class MaoPao {
    public static void main(String[] args) {
        int[] num = new int[]{9,5,4,3,8};
        Mather m = new Mather();
        m.paixu(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ",");
        }
    }
}
