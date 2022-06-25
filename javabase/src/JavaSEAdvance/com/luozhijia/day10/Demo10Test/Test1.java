package JavaSEAdvance.com.luozhijia.day10.Demo10Test;

import java.io.*;
import java.util.Properties;

/**
 * @anthor longway
 * @create 2022-06-23
 * 8:37
 */
/*
需求：
      请写程序实现猜数字小游戏只能试玩3次，如果害想玩，
      提示：游戏试玩已结束，想玩请充值（www.itcast.com）

 */
public class Test1 {
    public static void main(String[] args) {
        myload();
    }

    private static void myload() {
        try(Reader reader = new FileReader(new File("javabase/src/JavaSEAdvance/com/luozhijia/day10/Demo10Test/Num.txt"));) {
            //创建对象
            Properties pro = new Properties();
            pro.load(reader);
            String value = pro.getProperty("count");
            int it = Integer.parseInt(value);
            if (it < 3){
                //创建游戏对象
                Play play = new Play();
                play.show();
                it++;
                mySourt(it);
                System.out.println("游戏试玩次数：" + it);
            }else {
                System.out.println("游戏试玩次数已满");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void mySourt(int it) {
        try(Writer writer = new FileWriter(new File("javabase/src/JavaSEAdvance/com/luozhijia/day10/Demo10Test/Num.txt"));) {
            Properties pro = new Properties();
            String value = new String(String.valueOf(it));
            pro.setProperty("count",value);
            pro.store(writer,null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
