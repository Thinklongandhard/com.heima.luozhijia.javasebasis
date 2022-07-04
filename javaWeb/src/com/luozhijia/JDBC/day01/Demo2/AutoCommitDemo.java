package com.luozhijia.JDBC.day01.Demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @anthor longway
 * @create 2022-07-02
 * 11:18
 */
public class AutoCommitDemo {
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
            String sql1 = "update dp1 set salary = 3000 where id = 1";  //update dp1 set salary = 2000 where id = 1;
            String sql2 = "update dp1 set salary = 3000 where id = 2";

            //获取执行SQL对象
            Statement stmt = conn.createStatement();

            //事务管理


            try {
                //开启事务
                conn.setAutoCommit(false);

                //执行SQL
                int update1 = stmt.executeUpdate(sql1);
                //处理返回结果
                System.out.println(update1);
//                int a = 3/0;

                int update2 = stmt.executeUpdate(sql2);
                //处理返回结果
                System.out.println(update2);

                //提交事务
                conn.commit();
            } catch (Exception e) {
                //回滚事务
                conn.rollback();
                /*
                出现异常了，数据回滚
                java.lang.ArithmeticException: / by zero
	            at com.luozhijia.JDBC.day01.Demo2.AutoCommitDemo.main(AutoCommitDemo.java:43)
                 */

                e.printStackTrace();
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
