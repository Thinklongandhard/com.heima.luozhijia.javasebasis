package JavaSEAdvance.com.luozhijia.day13.Demo1;

/**
 * @anthor longway
 * @create 2022-06-25
 * 8:37
 */
public class Demo {
    public static void main(String[] args) {
//        uesEatable();
        uesEatable( () -> {
            System.out.println("吃");
        });
    }

    private static void uesEatable(Eatable e) {
        e.eat();
    }

}
