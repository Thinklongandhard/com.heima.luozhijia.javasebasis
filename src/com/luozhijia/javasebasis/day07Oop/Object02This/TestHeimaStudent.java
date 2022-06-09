package com.luozhijia.javasebasis.day07Oop.Object02This;

/**
 * @anthor longway
 * @create 2022-06-05
 * 17:03
 */
public class TestHeimaStudent {
    public static void main(String[] args){
        //创建对象
        HeimaStudent hms = new HeimaStudent();
        //修改
        hms.setAge(15);
        hms.setName("张三");
        hms.setVehicle("火车");
        System.out.println(hms.getName() + "现在的年龄为" + hms.getAge() + "岁，他的出行方式是：" + hms.getVehicle());

        System.out.println("-----------------");
        System.out.println(hms); //这里打印的hms 就是HeimaStudent类中this所指的当前对象
        //hms打印出的内存地址：  Object02This.HeimaStudent@4554617c
        hms.XueXi("李四");
        //HeimaStudent类中打印的this地址：  Object02This.HeimaStudent@4554617c
        System.out.println("-----------------");

        //创建对象
        HeimaStudent hms1 = new HeimaStudent();
        //修改
        hms1.setAge(15);
        hms1.setName("张三");
        hms1.setVehicle("火车");
        System.out.println(hms1.getName() + "现在的年龄为" + hms1.getAge() + "岁，他的出行方式是：" + hms1.getVehicle());

        System.out.println("-----------------");
        System.out.println(hms1); //这里打印的hms 就是HeimaStudent类中this所指的当前对象
        //hms1打印出来的内存地址：  Object02This.HeimaStudent@74a14482
        hms1.XueXi("李四");
        //HeimaStudent类中打印的this地址：  Object02This.HeimaStudent@74a14482
    }
}
