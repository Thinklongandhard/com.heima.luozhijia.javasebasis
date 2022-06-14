package JavaSEAdvance.com.luozhijia.day01.Demo08ExtendsorOthers;

/**
 * @anthor longway
 * @create 2022-06-14
 * 17:36
 */
public class Short extends Animal{
    public Short() {
    }

    public Short(String name, int age) {
        super(name, age);
    }

    public void run(){
        System.out.println(getName() + "," + getAge() + "岁了，在逃跑");
    }
}
