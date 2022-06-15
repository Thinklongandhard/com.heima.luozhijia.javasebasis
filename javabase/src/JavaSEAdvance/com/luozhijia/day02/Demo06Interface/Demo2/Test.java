package JavaSEAdvance.com.luozhijia.day02.Demo06Interface.Demo2;

/**
 * @anthor longway
 * @create 2022-06-15
 * 14:06
 */
public class Test {
    public static void main(String[] args) {
        B h = new B();
        h.eat();
        h.setAge(13);
        h.setName("小李");
        System.out.println(h.getName() + "，" + h.getAge() + "岁");
        h.study();


        System.out.println("---------------");
        P b = new P();
        b.eat();
        b.study();
        b.English();


    }
}
