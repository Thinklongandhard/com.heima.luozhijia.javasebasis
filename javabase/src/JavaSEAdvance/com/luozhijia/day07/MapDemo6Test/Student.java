package JavaSEAdvance.com.luozhijia.day07.MapDemo6Test;

/**
 * @anthor longway
 * @create 2022-06-18
 * 13:58
 */
//学号 -- > Student
public class Student {
    private int num;
    private String name;

    public Student() {
    }

    public Student(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
