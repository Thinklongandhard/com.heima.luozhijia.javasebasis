package com.luozhijia.javasebasis.day07Oop.Object04Test;

/**
 * @anthor longway
 * @create 2022-06-05
 * 18:04
 */
/*
* 需求：
*   创建对象并为其成员变量赋值的两种方式
*   1、使用无参构造方法创建对象后使用set（）赋值
*   2、使用带参数构造方法直接创建带有属性值的对象
* */
public class TestHeima {
    public static void main(String[] args) {
        //1、使用无参构造方法创建对象后使用set（）赋值
        Heima hm = new Heima();
        hm.setAge(15);
        hm.setName("张三");
        hm.setLaoshi("杜薇");
        hm.show();

        System.out.println("------------------");
        hm.setAge(10);
        hm.setName(null);
        hm.setLaoshi(null);
        hm.show();
        System.out.println("------------------");

        //2、使用带参数构造方法直接创建带有属性值的对象
        Heima hm1 = new Heima(20,"李四","杜薇");
        hm1.show();
    }
}
