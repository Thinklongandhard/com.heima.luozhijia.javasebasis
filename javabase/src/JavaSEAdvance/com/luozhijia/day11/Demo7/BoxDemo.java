package JavaSEAdvance.com.luozhijia.day11.Demo7;

/**
 * @anthor longway
 * @create 2022-06-23
 * 16:43
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box();
        Producer p1 = new Producer(b);
        Customer c1= new Customer(b);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(c1);

        //启动线程
        t1.start();
        t2.start();

    }
}
