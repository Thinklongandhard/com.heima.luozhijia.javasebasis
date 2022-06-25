package JavaSEAdvance.com.luozhijia.day11.Demo7;

/**
 * @anthor longway
 * @create 2022-06-23
 * 16:42
 */
public class Customer implements Runnable{
    Box b;

    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        while (true) {
            b.get();
        }
    }
}
