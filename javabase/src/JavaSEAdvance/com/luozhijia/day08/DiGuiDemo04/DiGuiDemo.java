package JavaSEAdvance.com.luozhijia.day08.DiGuiDemo04;

/**
 * @anthor longway
 * @create 2022-06-19
 * 11:26
 */
//需求：  用递归求5的阶乘，并把结果在控制台输出
public class DiGuiDemo {
    public static void main(String[] args) {
        System.out.println(file(5));
    }

    public static int file(int n){
        if (n == 1){
            return 1;
        }else {
            return file(n-1)*n;
        }
    }
}
