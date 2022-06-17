package JavaSEAdvance.com.luozhijia.day06.Demo02;

/**
 * @anthor longway
 * @create 2022-06-17
 * 10:38
 */
public class HashCodeTest {
    public static void main(String[] args) {
        //创建学生对象
        Student2 s = new Student2();

        //1163157884
        //同一个对象多次调用hashCode()方法返回的哈希值是相同的
        System.out.println(s.hashCode());
        System.out.println(s.hashCode());

        Student2 s2 = new Student2();

        //1956725890
        //默认情况下，不同对象的哈希值是不相同的
        System.out.println(s2.hashCode());

        //通过方法重写，可以实现不同对象的哈希值是相同的

        System.out.println("hello".hashCode()); //99162322
        System.out.println("word".hashCode());  //3655434
        System.out.println("java".hashCode());  //3254818
        //不同对象的哈希值是不同的
        System.out.println("------------");

        //字符串中重写了Object中的hashCode方法
        System.out.println("重地".hashCode());  //1179395
        System.out.println("通话".hashCode());  //1179395

    }
}
