package com.luozhijia.JDBC.day01.Demo3;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @anthor longway
 * @create 2022-07-02
 * 11:46
 */
public class Demo {

    @Test
    public void Test(){
        try {
            //注册驱动
            Class<?> mysql = Class.forName("com.mysql.jdbc.Driver");

            //获取连接
            String url = "jdbc:mysql://127.0.0.1:3306/dp1?useSSL=false";
            String username = "root";
            String password = "681219";
            Connection conn = DriverManager.getConnection(url, username, password);


            //定义SQL语句
            String sql = "update dp1 set salary = 2000 where id = 1";  //update dp1 set salary = 2000 where id = 1;
            //定义DDL语句 新建数据库dp2
            String sql1 = "create database dp2";
            //删除数据库dp2
            String sql2 = "drop database dp2";


            //获取执行SQL对象
            Statement stmt = conn.createStatement();
            //执行SQL
            int update = stmt.executeUpdate(sql);  //这里执行的是DML语句成功返回1，失败返回0
            //执行DDL语句
//            int ddl1 = stmt.executeUpdate(sql1);
            int ddl2 = stmt.executeUpdate(sql2);
//            System.out.println(ddl1);
            System.out.println(ddl2);  //删除成功 返回： 0
            //处理返回结果
            if (update > 0){
                System.out.println("修改成功");
            }else {
                System.out.println("修改失败");
            }


            //释放资源
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
