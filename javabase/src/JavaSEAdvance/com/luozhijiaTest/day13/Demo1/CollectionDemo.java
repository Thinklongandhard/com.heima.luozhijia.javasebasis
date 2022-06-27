package JavaSEAdvance.com.luozhijiaTest.day13.Demo1;

import java.util.concurrent.Callable;

/**
 * @anthor longway
 * @create 2022-06-25
 * 15:35
 */
//	定义一个线程类，实现Callable接口。此线程可以计算1--100的所有数字的累加和。
public class CollectionDemo extends Thread implements Callable{
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }


    @Override
    public void run() {
        try {
            Object call = call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
