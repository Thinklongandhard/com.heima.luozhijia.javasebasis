package JavaSEAdvance.com.luozhijia.day01.Demo07ExtendsorOthers;

/**
 * @anthor longway
 * @create 2022-06-14
 * 17:04
 */
public class Student extends Hemon {
    public Student(){

    }
    public Student(String name,int age){
        super.age = age;
        super.name = name;
    }
    public void study(){
        System.out.println(getName() + "学习" + getAge());
    }
}
