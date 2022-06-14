package JavaSEAdvance.com.luozhijia.day01.Demo09ExtendsorOthers;

/**
 * @anthor longway
 * @create 2022-06-14
 * 19:08
 */
public class Zi extends Fu{
    public static void main(String[] args) {
        Fu f = new Fu();
        f.show2();  //默认修饰方法
        f.show3();  //protected
        f.show4();  //public
    }
}
