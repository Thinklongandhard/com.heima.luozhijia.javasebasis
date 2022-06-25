package JavaSEAdvance.com.luozhijia.day10.Demo2;

import java.io.*;

/**
 * @anthor longway
 * @create 2022-06-23
 * 19:30
 */
public class Demo3 {
    public static void main(String[] args) {
        //创建一个源文件夹，一个目的文件夹
        File filestart = new File("G:\\桌面\\Java笔记\\笔记\\黑马学习记录\\JavaSE-基础");
        File fileend = new File("G:\\桌面\\Java笔记");
        //复制文件
        copyfile(filestart,fileend);
    }

    private static void copyfile(File filestart,File fileend) {
        //判断是不是文件夹
        if (filestart.isDirectory()){
            //获取文件名
            String name = filestart.getName();
            File newfile = new File(fileend,name);
            //判断路径是否存在
            if (!newfile.exists()){
                //新建路径
                newfile.mkdir();
            }
            //拿到所有文件名
            File[] files = filestart.listFiles();
            //变量数组，拿到每一个文件名
            for (File f : files){
                //递归调用创建文件夹
                copyfile(f,newfile);
            }
        }else{
            String name = filestart.getName();
            File newfile = new File(fileend,name);
            //复制文件
            copy(filestart,newfile);
        }
    }

    private static void copy(File f, File newfile) {
        //复制文件
        try(BufferedReader reader = new BufferedReader(new FileReader(f));
            BufferedWriter writer = new BufferedWriter(new FileWriter(newfile)))
        {
            //读取文件
            String len;
            while ((len = reader.readLine()) != null){
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
