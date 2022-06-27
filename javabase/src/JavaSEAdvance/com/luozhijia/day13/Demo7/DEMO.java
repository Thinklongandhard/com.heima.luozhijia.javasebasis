package JavaSEAdvance.com.luozhijia.day13.Demo7;

/**
 * @anthor longway
 * @create 2022-06-25
 * 15:10
 */
public class DEMO {
    public static void main(String[] args) {
        useStudent(Student::new);
    }
    public static void useStudent(StudentBulider sb){
        Student s = sb.build("张三", 18);
        System.out.println(s.getName() + "," + s.getAge());
    }
}
