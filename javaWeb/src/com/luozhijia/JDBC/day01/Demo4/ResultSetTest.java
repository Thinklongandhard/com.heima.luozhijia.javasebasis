package com.luozhijia.JDBC.day01.Demo4;

import org.junit.Test;

import java.sql.*;

/**
 * @anthor longway
 * @create 2022-07-02
 * 12:07
 */
public class ResultSetTest {

    @Test
    public void test(){
        //测试ResultSet
        try {
            //注册驱动
            Class<?> mysql = Class.forName("com.mysql.jdbc.Driver");

            //获取连接
            String url = "jdbc:mysql://127.0.0.1:3306/dp1?useSSL=false";
            String username = "root";
            String password = "681219";
            Connection conn = DriverManager.getConnection(url, username, password);
            //编写DQL语句
            String sql1 = "select * from dp1";

            //创建statement对象
            Statement stmt = conn.createStatement();

            //执行dql语句
            ResultSet dql = stmt.executeQuery(sql1);
            //循环遍历，获取返回值
//            while (dql.next()){
//                //可以使用索引
//                int id = dql.getInt(1);
//                String name = dql.getString(2);
//                double money = dql.getDouble(3);
//                //输出返回值
//                System.out.println(id);
//                System.out.println(name);
//                System.out.println(money);
//
//                System.out.println("----------------");
//            }

            while (dql.next()){
                //可以使用列名
                int id = dql.getInt("id");
                String name = dql.getString("name");
                double money = dql.getDouble("salary");
                //输出返回值
                System.out.println(id);
                System.out.println(name);
                System.out.println(money);

                System.out.println("----------------");
            }

            //释放资源
            dql.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
