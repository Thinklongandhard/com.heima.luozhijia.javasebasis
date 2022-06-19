package JavaSEAdvance.com.luozhijia.day08.FileDemo01;

import java.io.File;

/**
 * @anthor longway
 * @create 2022-06-19
 * 9:56
 */

/*File(String pathname)
        //通过将给定的路径名字符串转换为抽象路径名来创建新的File实例
        File(String parent,String child)
        //从父路径名字符串和子路径字符串创建新的File实例
        File(File parent,String child)
//从父抽象路径名和子路径名字符串创建新的File实例*/
public class FileDemo {
    public static void main(String[] args){
        //方法1
//        File f1 = new File("G:\\桌面\\Java笔记\\笔记\\黑马学习记录\\javaSE-进阶\\day08-IO流\\资料\\javaIO.txt");
//        System.out.println(f1);
        //方法2
        File f2 = new File("G:\\桌面\\Java笔记\\笔记\\黑马学习记录\\javaSE-进阶\\day08-IO流\\资料","javaIO.txt");
        System.out.println(f2);
        //方法3
        File f3 = new File("G:\\桌面\\Java笔记\\笔记\\黑马学习记录\\javaSE-进阶\\day08-IO流\\资料");
        File f4 = new File(f3,"javaIO.txt");
        System.out.println(f4);
    }
}
