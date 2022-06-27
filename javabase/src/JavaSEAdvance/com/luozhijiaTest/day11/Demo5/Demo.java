package JavaSEAdvance.com.luozhijiaTest.day11.Demo5;

/**
 * @anthor longway
 * @create 2022-06-25
 * 19:52
 */
public class Demo {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 1; i <= 100; i++) {
                    sum += i;
                }
                System.out.println(sum);
            }
        });
        t.start();
    }
}
