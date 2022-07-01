package JavaSEAdvance.com.luozhijiaTest.day15.Demo2;

import java.io.*;

/**
 * @anthor longway
 * @create 2022-06-28
 * 18:09
 */
/*
 把“文件夹路径”复制到G盘目录下
 思路：
      1、创建数据源File对象，路径是“源文件夹路径”
      2、创建目的地File对象，路径是G：\\
      3、写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
      4、判断数据源File是否是目录
          是：
             A：在目的地下创建和数据源File名称一样的目录
             B：获取数据源File下所有文件或者目录的File数组
             C：遍历该File数组，得到每一个File对象
             D：把该File作为数据源File对象，递归调用复制文件的方法
          不是：
             说明是文件，直接复制，用字节流
 */
public class Demo {
    public static void main(String[] args) {
        //创建字节缓冲流，调用复制文件方法
        File start = new File("G:\\桌面\\Java笔记\\笔记\\黑马学习记录\\JavaSE-基础");
        File end = new File("G:\\桌面\\Java笔记");
        //调用复制文件夹方法
        copeD(start, end);
    }

    //复制文件夹
    private static void copeD(File start, File end) {
        //判断源文件是否是一个文件夹
        if (start.isDirectory()) {
            //是一个文件夹
            //获取文件名
            String startName = start.getName();
            //判断该文件在目标路径下是否存在
            File endname = new File(end, startName);
//            System.out.println(endname);
            if (!endname.exists()) {
                //创建目录
                endname.mkdir();
            }
            //获取所有的文件名
            File[] files = start.listFiles();
            for (File f : files) {
                //拿到了所有的目录递归调用
                copeD(f, endname);

            }

        } else {
            //说明不是文件夹，是文件，复制文件
            //获取文件名
//            String name = start.getName();
//            System.out.println(name);
            File end1 = new File(end, start.getName());
//            System.out.println(end1);
            copefile(start, end1);
        }
    }

    private static void copefile(File start, File end1) {
        //复制文件
        //创建缓冲流
        try (BufferedInputStream br = new BufferedInputStream(new FileInputStream(start));
             BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(end1));) {
            //读数据
            int len;
            byte[] bys = new byte[1024];
            while ((len = br.read(bys)) != -1) {
                //复制
                bw.write(bys,0,len);
                bw.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
