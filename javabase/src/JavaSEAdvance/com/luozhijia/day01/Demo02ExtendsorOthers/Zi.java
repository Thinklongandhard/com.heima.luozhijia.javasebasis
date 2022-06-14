package JavaSEAdvance.com.luozhijia.day01.Demo02ExtendsorOthers;

/**
 * @anthor longway
 * @create 2022-06-14
 * 14:35
 */
public class Zi extends Fu{
    int age = 30;
    public void show(){
        int age = 20;
        int weigh = 175;
        //局部变量中的值
        System.out.println(age);
        //访问成员变量中的值
        System.out.println(this.age);
        //访问父类中的值
        System.out.println(super.age);
    }
}
