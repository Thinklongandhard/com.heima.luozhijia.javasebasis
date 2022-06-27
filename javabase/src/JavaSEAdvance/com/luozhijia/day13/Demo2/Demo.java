package JavaSEAdvance.com.luozhijia.day13.Demo2;

/**
 * @anthor longway
 * @create 2022-06-25
 * 8:50
 */
public class Demo {
    public static void main(String[] args) {
        Flyable f = new Flyablempli();
        useFlyable(f);
        //
        useFlyable((String s) -> {
            System.out.println();
            System.out.println(s);
        });

    }
    public static void useFlyable(Flyable f){
        f.fly("asdasd");
    }
}
