package com.luozhijia.javasebasis.day07Oop.Object02This;

/**
 * @anthor longway
 * @create 2022-06-05
 * 16:55
 */
public class HeimaStudent {
    private String name;
    private int age;
    private String vehicle;

    //学习的行为
    public void XueXi(String name){
        System.out.println(this.name + "：在学习");
        System.out.println(this);
    }

    //get和set方法 （set对变量进行修改，get对对象进行输出）
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age= age;
    }

    public int getAge(){
        return this.age;
    }
    public void setVehicle(String vehicle){
        this.vehicle = vehicle;
    }

    public String getVehicle(){
        return this.vehicle;
    }
}
