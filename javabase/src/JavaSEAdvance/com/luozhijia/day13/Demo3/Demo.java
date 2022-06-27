package JavaSEAdvance.com.luozhijia.day13.Demo3;

/**
 * @anthor longway
 * @create 2022-06-25
 * 9:09
 */
public class Demo {
    public static void main(String[] args) {
        Addable a = new AddableImpl();
        show(a);
        //使用Lambda
        show((int c,int b) -> {
            int i = c + b;
            System.out.println(i);

            return i;
        });
    }
    public static void show(Addable a){
        int x = 1;
        int y = 3;
        int add = a.add(x, y);
        System.out.println(add);
    }
}
