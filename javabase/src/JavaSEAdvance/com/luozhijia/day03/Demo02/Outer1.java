package JavaSEAdvance.com.luozhijia.day03.Demo02;

/**
 * @anthor longway
 * @create 2022-06-15
 * 15:48
 */

//局部内部类练习
public class Outer1 {
    private int age = 10;
    public void show1(){
        //局部变量
        int num = 20;
        //新建局部内部类
        class demo1{
            public void show(){
                System.out.println(age);
                System.out.println(num);
            }
        }
        demo1 d1 = new demo1();
        d1.show();
    }
}
