package JavaSEAdvance.com.luozhijia.day01.Demo08ExtendsorOthers;

/**
 * @anthor longway
 * @create 2022-06-14
 * 17:33
 */
public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void push(){
        System.out.println(getName() + "，" + getAge() + "岁了，正在捕猎" );
    }
}
