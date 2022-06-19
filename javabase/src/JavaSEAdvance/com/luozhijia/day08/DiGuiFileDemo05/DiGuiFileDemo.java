package JavaSEAdvance.com.luozhijia.day08.DiGuiFileDemo05;

import java.io.File;

/**
 * @anthor longway
 * @create 2022-06-19
 * 11:46
 */
//给定一个路径，通过递归完成遍历该目录下的所有内容
    //并把所有文件的绝对路径输出在控制台
public class DiGuiFileDemo {
    public static void main(String[] args) {
        //拿到路径
        File f = new File("G:\\桌面\\Java笔记\\笔记\\黑马学习记录\\javaSE-进阶\\day08-IO流\\资料");

        file(f);

    }
    public static void file(File list){
        File[] files = list.listFiles();
        //遍历数组获取每一个file对象
        if (files != null){
            for (File f : files){
                //判断是不是目录
                if (f.isDirectory()){
                    file(f);
                }else {
                    //获取绝对路径
                    String path = f.getAbsolutePath();
                    System.out.println(path);
                }
            }
        }
    }
}
