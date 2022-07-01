package JavaSEAdvance.com.luozhijia.day16Junit.testDemo;

import JavaSEAdvance.com.luozhijia.day16Junit.Demo1.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @anthor longway
 * @create 2022-06-30
 * 9:10
 */
public class Calucatortest {

    //测试Before 和 After
    @Before
    public void before(){
        //在方法执行之前，运行申请资源
        System.out.println("before...");
    }
    @After
    public void after(){
        //在方法运行结束之后释放资源
        System.out.println("after....");
    }


    //测试
    @Test
    public void testAdd(){
//        System.out.println("我被执行了");
        //创建对象
        System.out.println("testadd....");
        Calculator c = new Calculator();
        int result = c.add(1, 2);
//        System.out.println(result);
        //断定结果为3
        //第一个参数是期望结果，第二个是运行结果
        Assert.assertEquals(3,result);
        //failNotEquals，与期望结果不符变红了，源程序有bug
    }

    //测试sub
    @Test
    public void testSub(){
        System.out.println("testsub....");
        //创建对象
        Calculator c = new Calculator();
        int result = c.sub(1, 2);
        Assert.assertEquals(-1,result);

    }
}
