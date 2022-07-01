package JavaSEAdvance.com.luozhijiaTest.day15.Demo1;

import java.io.File;

/**
 * @anthor longway
 * @create 2022-06-28
 * 17:05
 */
/*
请在D盘根目录下创建一个文件：test1.txt(随意录入一些内容)，再创建一个目录：测试目录
	请编写main()方法，创建以下两个File对象：
		File file1 = new File(“d:\\test1.txt”;
		File file2 = new File(“d:\\测试目录”);
	要求：
		1. 获取、打印file1和file2的绝对路径；
		2. 获取、打印file1和file2的文件名和目录名；
		3. 获取、打印file1和file2的文件大小；
		4. 分别判断file1和file2是否存在；
		5. 分别判断file1和file2是否是文件？是否是目录？
 */
public class Demo {
    public static void main(String[] args) {
        //目标路径
        File startfile = new File("G:\\桌面\\Java笔记\\材料\\Copy\\测试目录");
        File endfile = new File("G:\\桌面\\Java笔记\\材料\\Copy\\test1.txt");
        //获取，打印绝对路径
        //获取绝对路径的方法getAbsolutePath
//        String path1 = startfile.getAbsolutePath();
//        String path2 = endfile.getAbsolutePath();
//        System.out.println(path1 + " " + path2);
        //获取，打印文件名和目录名
        //获取文件名，路径名的方法是getName
//        String name1 = startfile.getName();
//        String name2 = endfile.getName();
//        System.out.println(name1 + " " + name2);
        //获取，打印文件的大小
//        long size = endfile.length();
//        System.out.println(size);
        //判断是否存在
        //exists()
        //测试此抽象路径名表示的文件或目录是否存在。
//        boolean exists1 = startfile.exists();
//        boolean exists2 = endfile.exists();
//        System.out.println(exists1);
//        System.out.println(exists2);
        //分别判断是否是文件，是否是目录
        //isAbsolute测试这个抽象路径名是否是绝对的
        //isDirectory测试此抽象路径名表示的文件是否为目录。
        //isFile判断是否是文件
        boolean d1 = startfile.isDirectory();
        boolean d2 = startfile.isFile();
        boolean d3 = endfile.isFile();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
