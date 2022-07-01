package JavaSEAdvance.com.luozhijia.day16Junit.Demo3Test;

/**
 * @anthor longway
 * @create 2022-06-30
 * 14:45
 */
public class Demo {
    @Check
    public void add(){
        System.out.println("1 + 0 =" + (1 + 0));
    }
    @Check
    public void sub(){
        System.out.println("1 + 0 =" + (1 - 0));
    }
    @Check
    public void Chen(){
        System.out.println("1 + 0 =" + (1 * 0));
    }
    @Check
    public void Chu(){
        System.out.println("1 + 0 =" + (1 / 0));
    }
}
