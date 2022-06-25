package JavaSEAdvance.com.luozhijia.day10.Demo10Test;

import java.io.*;
import java.util.Properties;

/**
 * @anthor longway
 * @create 2022-06-22
 * 16:43
 */
/*
需求：
   请写程序实现猜数字小游戏只能试玩3次，如果害想玩，
      提示：游戏试玩已结束，想玩请充值（www.itcast.com）

   思路：
      1、写一个游戏类，里面有一个猜数字的小游戏
      2、写一个测试类，测试类中有main()方法，main方法中按照下面步骤完成：
          A：从文件中读取数据到Properties集合，用load()方法实现
              文件以及存在：game.txt
              里面有一个数据值：count=0
          B：通过Properties集合获取到玩游戏的次数
          C：判断次数是否到达3次了
              如果到了，给出提示：游戏试玩已结束，想玩请充值（www.itcast.com）
              如果不到3次：
                   玩游戏
                   次数+1，重新写回文件，用Properties的store()方法实现
 */
public class Test {
    public static void main(String[] args) {
        //从文件中读取数据
        myload();
    }

    private static void myload() {
        Properties pro = new Properties();
        Play p = new Play();
        //读取数据
        try(Reader reader = new FileReader("javabase/src/JavaSEAdvance/com/luozhijia/day10/Demo9/IO.txt");) {
            pro.load(reader);
            String value = pro.getProperty("count");
            Integer count = new Integer(value);
            if (count <= 3){
                if (count == 3){
                    System.out.println("游戏试玩已经结束");
                    System.out.println("想玩请充值");
                }else {
                    p.show();
                    count++;
                    //重新写回文件
                    mySorte(count);
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void mySorte(Integer value) {
        //创建对象
        Properties pro = new Properties();
        try(Writer writer = new FileWriter("javabase/src/JavaSEAdvance/com/luozhijia/day10/Demo9/IO.txt");) {
            //把value转换为String类型
            String s = value.toString();
            //添加元素
            pro.put("count",s);
            pro.store(writer,null);
            System.out.println("试玩次数 : " + s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
