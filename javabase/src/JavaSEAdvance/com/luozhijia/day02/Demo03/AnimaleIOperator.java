package JavaSEAdvance.com.luozhijia.day02.Demo03;

/**
 * @anthor longway
 * @create 2022-06-15
 * 8:01
 */
public class AnimaleIOperator {
    /*public void useAnimale(Cat c){
        c.eat();
    }

    //添加新的方法
    public void useAnimale(Dognew d){
        d.eat();
    }*/
    //多态的形式
    public void useAnimale(Animale a){
        //Animale a = new Cat();
        //Animale a = new Dog();
        /*多态的形式*/  //提高的代码的扩展性
        a.eat();

        /*多态的形式不能访问子类特有的方法*/
        //a.lookdor();
    }
}
