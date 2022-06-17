package JavaSEAdvance.com.luozhijia.day06.Demo09TreeSet;

/**
 * @anthor longway
 * @create 2022-06-17
 * 16:57
 */
public class Student9 {
    private String name;
    private int yuwen;
    private int shuxue;

    public Student9() {
    }

    public Student9(String name, int yuwen, int shuxue) {
        this.name = name;
        this.yuwen = yuwen;
        this.shuxue = shuxue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYuwen() {
        return yuwen;
    }

    public void setYuwen(int yuwen) {
        this.yuwen = yuwen;
    }

    public int getShuxue() {
        return shuxue;
    }

    public void setShuxue(int shuxue) {
        this.shuxue = shuxue;
    }
    public int getNum(){
        return yuwen+shuxue;
    }
}
