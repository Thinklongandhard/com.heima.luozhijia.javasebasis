package JavaSEAdvance.com.luozhijia.day06.Demo10TreeSetTest;

/**
 * @anthor longway
 * @create 2022-06-17
 * 17:44
 */
public class Student implements Comparable<Student>{
    private int Chinese;
    private int Math;
    private String name;

    public Student() {
    }

    public Student(int chinese, int math, String name) {
        Chinese = chinese;
        Math = math;
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Student s) {
        int i = (this.Chinese + this.Math) - (s.Chinese + s.Math);
        int num2 = i==0 ? this.Chinese - s.Chinese : i;
        int num3 = num2==0 ? this.Math - s.Math : num2;
        int num4 = num3==0 ? this.name.compareTo(s.name) : num3;
        return num4;
    }
}
