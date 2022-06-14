package JavaSEAdvance.com.luozhijia.day01.Demo07ExtendsorOthers;

/**
 * @anthor longway
 * @create 2022-06-14
 * 17:04
 */
public class Teacher extends Hemon{
    public Teacher(){

    }
    public Teacher(String name,int age){
        super.age = age;
        super.name = name;
    }
    public void teach(){
        System.out.println(getName() + "教书" + getAge());
    }
}
