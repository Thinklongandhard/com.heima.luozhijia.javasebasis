package JavaSEAdvance.com.luozhijia.day08.DiGuiDemo03;

/**
 * @anthor longway
 * @create 2022-06-19
 * 11:22
 */
//递归
    //不死神兔
public class DiGuiDemo3 {
    public static void main(String[] args) {
        System.out.println(file(20));
    }
    public static int file(int n){
        if (n == 1 || n == 2){   //递归出口
            return 1;
        }else {
            return file(n-1) + file(n-2);  //递归规则
        }
    }
}
