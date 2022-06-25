package JavaSEAdvance.com.luozhijia.day10.Demo1;

/**
 * @anthor longway
 * @create 2022-06-21
 * 15:21
 */
public class Student {
    private String name;
    private int Chinese;
    private int Maths;
    private int English;

    public Student() {
    }

    public Student(String name, int chinese, int maths, int english) {
        this.name = name;
        Chinese = chinese;
        Maths = maths;
        English = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMaths() {
        return Maths;
    }

    public void setMaths(int maths) {
        Maths = maths;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }
}
