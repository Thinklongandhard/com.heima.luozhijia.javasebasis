package com.luozhijia.javasebasis.day09ArrayList.Demo05Test;

import java.util.ArrayList;

/**
 * @anthor longway
 * @create 2022-06-09
 * 17:24
 */
//实现增删改查
public class StudentMod extends Test{
    //增加
    public ArrayList<StudentData> zhengjia(String pass,ArrayList<StudentData> list){

        //判断集合中是否有该元素
        //通过学号判断
        //遍历
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i).getPass().equals(pass))){

            }
        }
        return list;
    }
    //删除
    //修改
    //查询
}
