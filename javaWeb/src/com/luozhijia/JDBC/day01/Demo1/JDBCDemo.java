package com.luozhijia.JDBC.day01.Demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @anthor longway
 * @create 2022-07-02
 * 9:43
 */
/*
JDBC学习
 */
public class JDBCDemo {
    public static void main(String[] args) {
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


            //获取执行SQL对象
            Statement stmt = conn.createStatement();
            //执行SQL
            int update = stmt.executeUpdate(sql);
            //处理返回结果
            System.out.println(update);


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
