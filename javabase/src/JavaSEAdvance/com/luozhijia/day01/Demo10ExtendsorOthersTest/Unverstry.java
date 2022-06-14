package JavaSEAdvance.com.luozhijia.day01.Demo10ExtendsorOthersTest;

/**
 * @anthor longway
 * @create 2022-06-14
 * 19:39
 */
public class Unverstry {
    public static void main(String[] args) {
        //访问公共的常量
        Student.Unverstry = "传智播客";
        final Student s = new Student();
        //s = new Student();    //final修饰以后不能被修改
        s.age = 40;
        s.name = "lll";
        s.show();
    }
}
