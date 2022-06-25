package JavaSEAdvance.com.luozhijia.day10.Demo2;

import java.io.*;

/**
 * @anthor longway
 * @create 2022-06-22
 * 9:59
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //创建数据源File对象，路径是E:\\itcast
        File srcFile = new File("G:\\桌面\\Java笔记\\笔记\\黑马学习记录\\JavaSE-基础");
        //创建目的地File对象，路径是F:\\
        File destFile = new File("G:\\桌面\\Java笔记");

        //写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
        copyFolder(srcFile,destFile);
    }

    //复制文件夹
    private static void copyFolder(File srcFile, File destFile) throws IOException {
        //判断数据源File是否是目录
        if(srcFile.isDirectory()) {
            //在目的地下创建和数据源File名称一样的目录
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile,srcFileName); //F:\\itcast
            if(!newFolder.exists()) {
                newFolder.mkdir();
            }

            //获取数据源File下所有文件或者目录的File数组
            File[] fileArray = srcFile.listFiles();

            //遍历该File数组，得到每一个File对象
            for(File file : fileArray) {
                //把该File作为数据源File对象，递归调用复制文件夹的方法
                copyFolder(file,newFolder);
            }
        } else {
            //说明是文件，直接复制，用字节流
            File newFile = new File(destFile,srcFile.getName());
            copyFile(srcFile,newFile);
        }
    }

    //字节缓冲流复制文件
    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }
}
