package com.luozhijia.JDBC.day01.Demo9Druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/**
 * @anthor longway
 * @create 2022-07-02
 * 17:06
 */
public class Demo {
    public static void main(String[] args){

        //导入jar包

        //定义配置文件

        //加载配置文件

        //获取连接池对象
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("E:\\work2020\\IDEA\\IDEAProject\\com.heima.luozhijia.javasebasis\\javaWeb\\src\\druid.properties"));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

            //获取数据库连接
            Connection conn = dataSource.getConnection();

            //输出
            System.out.println(conn);
            /*
            七月 02, 2022 5:24:15 下午 com.alibaba.druid.pool.DruidDataSource info
            信息: {dataSource-1} inited
                 com.mysql.jdbc.JDBC4Connection@46f5f779

             */
            //释放资源
            conn.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //获取当前路径
//        System.out.println(System.getProperty("user.dir"));

    }
}
