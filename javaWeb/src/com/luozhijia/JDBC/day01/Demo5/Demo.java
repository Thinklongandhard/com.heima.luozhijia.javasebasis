package com.luozhijia.JDBC.day01.Demo5;

import java.sql.*;
import java.util.ArrayList;

/**
 * @anthor longway
 * @create 2022-07-02
 * 14:22
 */
public class Demo {
    public static void main(String[] args) {
        //连接数据库
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //连接数据库
            String url = "jdbc:mysql://127.0.0.1:3306/dp1?useSSL=false";
            String username = "root";
            String password = "681219";
            Connection conn = DriverManager.getConnection(url,username,password);

            //创建statement对象
            Statement stmt = conn.createStatement();
            String sql = "select id,name,salary from dp1";
            ResultSet rs = stmt.executeQuery(sql);
            //创建Account对象
            ArrayList<Account> list = new ArrayList<Account>();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                Account ac = new Account(id,name,salary);
                list.add(ac);
            }
            rs.close();
            stmt.close();
            conn.close();
            //遍历集合
            for (Account c : list){
                System.out.println(c.getId() + " " + c.getName() + " " + c.getSalary());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
