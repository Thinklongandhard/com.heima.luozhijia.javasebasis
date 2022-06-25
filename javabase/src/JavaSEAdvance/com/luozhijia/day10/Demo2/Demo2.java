package JavaSEAdvance.com.luozhijia.day10.Demo2;

import java.io.*;

/**
 * @anthor longway
 * @create 2022-06-23
 * 8:02
 */
//复制多级文件夹
public class Demo2 {
    public static void main(String[] args) {
        File filestact = new File("G:\\桌面\\Java笔记\\笔记\\黑马学习记录\\JavaSE-基础");
        File fileend = new File("G:\\桌面\\Java笔记");
        //复制文件夹的方法
        copyfile(filestact,fileend);
    }

    //复制文件夹
    /*
             A：在目的地下创建和数据源File名称一样的目录
             B：获取数据源File下所有文件或者目录的File数组
             C：遍历该File数组，得到每一个File对象
             D：把该File作为数据源File对象，递归调用复制文件的方法
          不是：
             说明是文件，直接复制，用字节流
     */
    private static void copyfile(File filestact, File fileend) {
        //判断数据源文件是不是目录
        if(filestact.isDirectory()) {
            //获取所有的文件名
            String name = filestact.getName();
            File newname = new File(fileend, name);
            //System.out.println(newname);
            //判断文件夹是否存在，
            if (!(newname.exists())) {
                //在新路径中创建该该文件夹
                newname.mkdir();
            }
            //获取源目录下的所有文件
            File[] files = filestact.listFiles();
            for (File f : files) {
                copyfile(f,newname);
            }
        }else{
            //获取文件名
            File newfile = new File(fileend,filestact.getName());
            //说明是文件直接复制
            copy(filestact,newfile);
        }

    }

    public static void copy(File filestact,File newfile){
        try(BufferedReader reader = new BufferedReader(new FileReader(filestact));
            BufferedWriter writer = new BufferedWriter(new FileWriter(newfile))
        ) {
            //读
            String len;
            while ((len= reader.readLine()) != null){
                //写
                writer.write(len);
                writer.newLine();
                writer.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
