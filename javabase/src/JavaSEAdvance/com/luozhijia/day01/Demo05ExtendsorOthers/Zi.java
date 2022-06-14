package JavaSEAdvance.com.luozhijia.day01.Demo05ExtendsorOthers;

/**
 * @anthor longway
 * @create 2022-06-14
 * 16:27
 */
public class Zi extends Fu {
    @Override
    public void Phone(){

    }
    /*@Override     //错误信息：Method does not override method from its superclass
    private void P1(){

    }*/    //父类私有的方法不能被访问，不存在重写

    /*@Override   //可以访问
    void P2(){

    }*/
    //或者
    @Override
    public void P2(){

    }

}
