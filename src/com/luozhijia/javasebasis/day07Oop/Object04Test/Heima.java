package com.luozhijia.javasebasis.day07Oop.Object04Test;

/**
 * @anthor longway
 * @create 2022-06-05
 * 18:04
 */
/*
* 需求：
*   标准类制作：
*     1、成员变量：都使用private修饰
*     2、构造方法：
*         提供一个无参构造方法
*         提供一个带多个参数的构造方法
*     3、成员方法
*         提供每一个成员变量对应的get/set方法
*         提供一个现实对象信息的show（）
* */
public class Heima {
    //1、成员变量：都使用private修饰
    private int age;
    private String name;
    private String Laoshi;

    //构造方法 (无参，有参)
    public Heima(){

    }
    public Heima(int age,String name,String Laoshi){
        this.age = age;
        this.name = name;
        this.Laoshi = Laoshi;
    }

    /*
    * 3、成员方法
    *         提供每一个成员变量对应的get/set方法
    *         提供一个现实对象信息的show（）
    *
    *     get/set方法快捷方式：Generate
    * */
    //get获取，set修改
    public void setAge(int age) {
        if (age <= 120 & age >= 10){
            this.age = age;
        }else{
            System.out.println("年龄格式有误");
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLaoshi(String laoshi){
        this.Laoshi = laoshi;
    }

    //get方法
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String getLaoshi(){
        return this.Laoshi;
    }

    //提供一个现实对象信息的show（）
    public void show(){
        System.out.println("这位学生的姓名为：" + name + ",年龄为：" + age);
        System.out.println("他的老师是：" + Laoshi + "老师");
    }
}
