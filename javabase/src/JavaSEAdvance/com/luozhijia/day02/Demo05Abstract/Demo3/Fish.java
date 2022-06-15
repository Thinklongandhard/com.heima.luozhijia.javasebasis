package JavaSEAdvance.com.luozhijia.day02.Demo05Abstract.Demo3;

/**
 * @anthor longway
 * @create 2022-06-15
 * 10:44
 */
public class Fish extends Animale{
    @Override
    public void eat() {
        System.out.println("吃");
    }

    public void shour(){
        Animale a = new Animale(30) {
            @Override
            public void eat() {
                System.out.println("chi");
            }
        };    //修改父类中的age
        a.show();
    }
}
