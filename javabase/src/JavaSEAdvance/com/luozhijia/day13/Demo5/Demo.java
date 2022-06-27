package JavaSEAdvance.com.luozhijia.day13.Demo5;

/**
 * @anthor longway
 * @create 2022-06-25
 * 14:30
 */
public class Demo {
    public static void main(String[] args) {
//        show(String::toUpperCase);
        //引用对象的实例方法
        PrintString ps = new PrintString();
        show(ps::printUpperCase);
    }
    public static void show(Printer p){
        p.printUpperCase("helloworld");
//        System.out.println(s);

    }
}
