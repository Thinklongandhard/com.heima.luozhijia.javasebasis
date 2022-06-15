package JavaSEAdvance.com.luozhijia.day03.Demo03;

/**
 * @anthor longway
 * @create 2022-06-15
 * 16:01
 */

/*  前提： 存在一个类或者接口，这里的类可以是具体类也可以是抽象类

        格式：
        new 类名或者接口名(){
        重写方法
        }
        */
//存在一个类或者接口，这里的类可以是具体类也可以是抽象类
public class Outer2  {
    public void show(){
        /*//匿名内部类
        new inter(){
            @Override
            public void show() {

            }
        };*/
        inter i = new inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        i.show();  //对象调了show方法
        i.show();
    }
}
