package JavaSEAdvance.com.luozhijia.day06.Demo07TreeSet;

/**
 * @anthor longway
 * @create 2022-06-17
 * 15:30
 */
public class Student7 implements Comparable<Student7> {
    private int age;
    private String name;

    public Student7() {
    }

    public Student7(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //重写排序方法
    //按照年龄大小排，年龄相同按照首字母前后排序
    @Override
    public int compareTo(Student7 o) {

        //this当前变量，是要存入的当前数据
        //o.age是上一个变量，是前一个存入的数据
        //当存入第一个元素时，this.age - o.age 为正
        int num = this.age - o.age;
        int num2 = num==0 ? this.name.compareTo(o.name) : num;
        //return 0   表示两个数相同 不存储
        //return 1   表示后一个比前一个大，按存储顺序排（升序）
        //return -1  表示现存的大于后存的，倒序存储（降序）
        return num2;
    }
}
