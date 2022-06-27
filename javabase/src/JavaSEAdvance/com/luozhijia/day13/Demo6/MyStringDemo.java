package JavaSEAdvance.com.luozhijia.day13.Demo6;

/**
 * @anthor longway
 * @create 2022-06-25
 * 14:53
 */
public class MyStringDemo {
    public static void main(String[] args) {
        show(String::substring);
        //Lombda表达式被实例方法代替的时候
        //第一个参数作为调用者
        //后面的参数作为方法的参数
    }
    public static void show(MyString s){
        String s1 = s.mySubString("asldjalasd", 0, 5);
        System.out.println(s1);
    }
}
