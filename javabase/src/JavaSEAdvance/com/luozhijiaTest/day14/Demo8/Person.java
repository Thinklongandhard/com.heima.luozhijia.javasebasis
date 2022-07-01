package JavaSEAdvance.com.luozhijiaTest.day14.Demo8;

/**
 * @anthor longway
 * @create 2022-06-28
 * 17:00
 */
/*
.定义一个Person类，包含一个属性：姓名(String)
	  	定义无参、全参构造方法
		定义get/set方法
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
