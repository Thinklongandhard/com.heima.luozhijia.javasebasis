package JavaSEAdvance.com.luozhijia.day11.Demo7;

/**
 * @anthor longway
 * @create 2022-06-23
 * 16:40
 */
public class Producer implements Runnable{
    private Box b;

    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        //存入牛奶
        for (int i = 1; i <= 5; i++) {
            b.set(i);
        }
    }
}
