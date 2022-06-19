package JavaSEAdvance.com.luozhijia.day08.FileDemo02;

import java.io.File;
import java.io.IOException;

/**
 * @anthor longway
 * @create 2022-06-19
 * 10:36
 */
/*
        public boolean isDirectory()
		  //测试此抽象路径名表示的File是否为目录
		public boolean isFile()
		  //测试此抽象路径名表示的File是否为文件
		public boolean exists()
		  //测试此抽象路径名表示的File是否存在
		public String getAbsolutePath()
		  //返回此抽象路径名的绝对路径名字符串
		public String getPath()
		  //将此抽象路径名转换为路径名字符串
		public String getName()
		  //返回由此抽象路径名表示的文件或目录的名称
		public String[] list()
		  //返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
		public File[] listFiles()
		  //返回此抽象路径名表示的目录中的文件和目录的File对象数组
 */
public class FileDemo2 {
    public static void main(String[] args) {
        //创建一个文件
        String path = "G:\\桌面\\Java笔记\\笔记\\黑马学习记录\\javaSE-进阶\\day08-IO流\\资料\\javaSE\\java\\IO";
        File f = new File(path);
        File f1 = new File("G:\\桌面\\Java笔记\\笔记\\黑马学习记录\\javaSE-进阶\\day08-IO流\\资料\\javaSE.txt");
        try {
            System.out.println(f1.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建一个文件
        System.out.println(f.mkdirs());
        //在IO文件下创建一个文件
        File f2 = new File("G:\\桌面\\Java笔记\\笔记\\黑马学习记录\\javaSE-进阶\\day08-IO流\\资料\\javaSE\\java\\IO\\IO.txt");
        try {
            System.out.println(f2.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*public boolean isDirectory()
        //测试此抽象路径名表示的File是否为目录
        public boolean isFile()
        //测试此抽象路径名表示的File是否为文件
        public boolean exists()
        //测试此抽象路径名表示的File是否存在*/
        System.out.println("---------------");
        System.out.println(f1.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f.exists());
        System.out.println("===================");
        /*
        public String getAbsolutePath()
		  //返回此抽象路径名的绝对路径名字符串
		public String getPath()
		  //将此抽象路径名转换为路径名字符串
		public String getName()
		  //返回由此抽象路径名表示的文件或目录的名称
         */
        String s = f.getAbsolutePath();  //返回绝对路径
        String s1 = f.getPath();   //返回路径名（字符串类型）
        String s2 = f.getName();   //返回文件或目录的名称
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("--------------");

        /*
        public String[] list()
		  //返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
		public File[] listFiles()
		  //返回此抽象路径名表示的目录中的文件和目录的File对象数组
         */
        File f5 = new File("G:\\桌面\\Java笔记\\笔记\\黑马学习记录\\javaSE-进阶\\day08-IO流\\资料");
        String[] s3 = f.list();      //返回目录中的文件和目录的名称
        File[] f4 = f5.listFiles();   //返回此目录中的每一个文件的文件路径
        for (String s4 : s3){
            System.out.println(s4);
        }
        for (File file : f4){
            System.out.println(file + " ");
        }
    }
}
