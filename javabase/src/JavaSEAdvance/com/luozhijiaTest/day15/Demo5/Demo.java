package JavaSEAdvance.com.luozhijiaTest.day15.Demo5;

import java.io.File;

/**
 * @anthor longway
 * @create 2022-06-28
 * 19:02
 */
//请使用递归遍历一个多级目录，打印所有文件的“绝对路径”。
public class Demo {
    public static void main(String[] args) {
        //目标路径
        File file = new File("G:\\桌面\\Java笔记\\笔记\\黑马学习记录\\JavaSE-基础");
        cofyd(file);
    }

    private static void cofyd(File file) {
        //判断是不是目录
        if (file.isDirectory()){
            //是目录
            //获取目录名
//            String name = file.getName();
            File[] files = file.listFiles();
            for (File f : files){
                File fi = new File(file,f.getName());
                cofyd(fi);
            }

        }else if (file.isFile()){
            System.out.println(file.getPath());
        }
    }
}
