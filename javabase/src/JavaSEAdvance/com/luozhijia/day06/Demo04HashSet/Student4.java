package JavaSEAdvance.com.luozhijia.day06.Demo04HashSet;

/**
 * @anthor longway
 * @create 2022-06-17
 * 12:05
 */
public class Student4 {
    private int age;
    private String name;

    public Student4() {
    }

    public Student4(int age, String name) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student4 student4 = (Student4) o;

        if (age != student4.age) return false;
        return name != null ? name.equals(student4.name) : student4.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
