package JavaSEAdvance.com.luozhijia.day05.CollectionDemo4;

/**
 * @anthor longway
 * @create 2022-06-16
 * 16:01
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("小明",18);
        Student s2 = new Student("小红",18);
        Student s3 = new Student("小明",20);
        Student[] s = new Student[]{s1,s2,s3};
        CollectionTest c = new CollectionTest();
        c.show(s);
    }
}
