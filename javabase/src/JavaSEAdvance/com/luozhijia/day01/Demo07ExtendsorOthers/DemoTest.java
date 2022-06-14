package JavaSEAdvance.com.luozhijia.day01.Demo07ExtendsorOthers;

/**
 * @anthor longway
 * @create 2022-06-14
 * 17:04
 */
public class DemoTest {
    public static void main(String[] args) {
        //创建对象
        Teacher t = new Teacher();
        t.setAge(30);
        t.setName("li");
        t.teach();

        //有参
        Teacher t1 = new Teacher("luo",33);
        t1.teach();
    }
}
