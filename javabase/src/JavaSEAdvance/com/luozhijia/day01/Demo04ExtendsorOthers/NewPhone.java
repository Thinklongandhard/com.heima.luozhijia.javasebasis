package JavaSEAdvance.com.luozhijia.day01.Demo04ExtendsorOthers;

/**
 * @anthor longway
 * @create 2022-06-14
 * 15:53
 */
public class NewPhone extends Phone {

    @Override   //注解，出现这个注解后会拿着此方法去和父类中这个方法进行比较，如果不是构造方法会报错
    public void call(String name){
        System.out.println("开视频");
        super.call(name);
    }
}
