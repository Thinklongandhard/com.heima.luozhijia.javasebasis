package JavaSEAdvance.com.luozhijia.day10.Demo2;

import java.io.*;

/**
 * @anthor longway
 * @create 2022-06-21
 * 16:46
 */
/*
需求：
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
        File filestact = new File("G:\\桌面\\Java笔记\\笔记\\黑马学习记录\\JavaSE-基础");  //原目录
        File fileend = new File("G:\\桌面\\Java笔记");  //目标目录

        copefile(filestact,fileend);

    }

    private static void copefile(File filestact, File fileend) {
        if (filestact.isDirectory()){
            String filestactName = filestact.getName();
            File newfile = new File(fileend,filestactName);
            ////在目的地下创建和数据源File名称一样的目录
            if (!newfile.exists()){  //测试此抽象路径名表示的文件或目录是否存在。
                newfile.mkdir();  //创建目录
            }
            File[] files = filestact.listFiles();
            for (File f : files){
                //把该File作为数据源File对象，递归调用复制文件夹的方法
                copefile(f,newfile);
            }
        }else{
            //说明是一个文件
            //直接复制
//            System.out.println(fileend);
//            System.out.println(filestact.getName());
            File newfile = new File(fileend,filestact.getName());
//            System.out.println(newfile);
//            System.out.println(filestact);
            show(filestact,newfile);
        }
    }

    //复制文件
    public static void show(File filestact,File fileend){
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream(filestact));
            out = new BufferedOutputStream(new FileOutputStream(fileend));

            //复制文件
            byte[] b = new byte[1024];
            int len;
            while ((len = in.read(b)) != -1){
                out.write(b,0,len);
            }

            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
