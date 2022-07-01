package JavaSEAdvance.com.luozhijia.day15.Demo1;

/**
 * @anthor longway
 * @create 2022-06-28
 * 21:30
 */
/*
        1、使用类的class属性来获取该类的Class对象
		Student.class 将会返回Student类的Class对象
		2、调用对象的getClass方法，返回该对象所属类的Class对象
		   该方法是Object类中的方法，所有的java类都可以调用
		3、使用Class类中的静态方法forName(String className),   灵活性高
		   传入的参数是某个类的全路径
 */
public class Demo {
    public static void main(String[] args) {
        Class<Student> c1 = Student.class;
        System.out.println(c1);
        Class<Student> c2 = Student.class;
        System.out.println(c1 == c2);
        System.out.println("--------");

        //2、调用对象的getClass方法，返回该对象所属类的Class对象
        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c1 == c3);
        System.out.println("--------");

        //使用Class类中的静态方法forName(String className),传入的参数是某个类的全路径
        try {
            Class<?> c4 = Class.forName("JavaSEAdvance.com.luozhijia.day15.Demo1.Student");
            System.out.println(c1 == c4);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
