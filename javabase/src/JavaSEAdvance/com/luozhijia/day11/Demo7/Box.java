package JavaSEAdvance.com.luozhijia.day11.Demo7;

/**
 * @anthor longway
 * @create 2022-06-23
 * 16:38
 */
public class Box {
    private int num;
    private boolean milk = false;

    //用户取出牛奶
    public synchronized void get() {
        if (!milk) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //有牛奶，取走
        System.out.println("取出第" + this.num + "瓶牛奶");
        milk = false;
        notifyAll();
    }

    public synchronized void set(int num) {
        if (milk) {  //有牛奶
            try {
                //等待取走
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //没有牛奶
        this.num = num;
        System.out.println("存入第" + this.num + "瓶牛奶");

        milk = true;
        //唤醒
        notifyAll();
    }
}
