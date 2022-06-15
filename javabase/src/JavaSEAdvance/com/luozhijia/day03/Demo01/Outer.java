package JavaSEAdvance.com.luozhijia.day03.Demo01;

/**
 * @anthor longway
 * @create 2022-06-15
 * 15:29
 */


public class Outer {
    private int age = 10;

    //这就是一个成员内部类
    public class demo{
        public void show() {
            System.out.println(age);
        }
    }

    public void show1(){
        demo d = new demo();
        d.show();
    }
}
