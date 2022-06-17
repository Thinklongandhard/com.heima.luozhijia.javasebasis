package JavaSEAdvance.com.luozhijia.day04.Demo10Throwable;

/**
 * @anthor longway
 * @create 2022-06-16
 * 11:35
 */
public class TryORcatch {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
    }

    private static void method() {
        try{
            int[] arr = new int[]{1,2,3};
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            //public String getMessage()
            //返回此throwable的详细信息字符串
            System.out.println(e.getMessage());
            //public String toString()
            //返回此可能抛出的简短描述
            System.out.println(e.toString());
            //public void printStackTrace()
            //把异常的错误信息输出在控制台
            e.printStackTrace();
        }
        System.out.println("结束");
    }
}
