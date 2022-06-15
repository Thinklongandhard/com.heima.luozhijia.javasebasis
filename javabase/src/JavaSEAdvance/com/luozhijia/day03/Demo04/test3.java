package JavaSEAdvance.com.luozhijia.day03.Demo04;

/**
 * @anthor longway
 * @create 2022-06-15
 * 16:14
 */
public class test3 {
    public static void main(String[] args) {
        JumppingDemo j = new JumppingDemo();
        jumpping c = new Cat3();  //多态
        j.show(c);  //jumpping j   show方法里要传一个jumpping对象
        System.out.println("-------------");


        //匿名内部类的形式
        j.show(new jumpping() {
            @Override
            public void jump() {
                System.out.println("跳过");
            }
        });
        //匿名内部类，本质上就是一个对象
    }
}
