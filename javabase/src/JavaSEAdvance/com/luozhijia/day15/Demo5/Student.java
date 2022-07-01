package JavaSEAdvance.com.luozhijia.day15.Demo5;

/**
 * @anthor longway
 * @create 2022-06-29
 * 10:13
 */
public class Student {
    private String name;
    private int age;
    private String path;

    Student(int age){
        this.age = age;
    }

    private Student(String name){
        this.name = name;
    }

    public Student() {
    }

    public Student(String name, int age, String path) {
        this.name = name;
        this.age = age;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void show(){
        System.out.println("芜湖");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", path='" + path + '\'' +
                '}';
    }
}
