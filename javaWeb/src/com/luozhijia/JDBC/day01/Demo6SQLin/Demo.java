package com.luozhijia.JDBC.day01.Demo6SQLin;

import org.junit.Test;

import java.sql.*;

/**
 * @anthor longway
 * @create 2022-07-02
 * 15:06
 */
//SQL注入
public class Demo {

    @Test
    public void test(){
        try {
            //注册MySQL
            Class.forName("com.mysql.jdbc.Driver");
            //登录
            String url = "jdbc:mysql://127.0.0.1:3306/dp1?useSSL=false";
            String username = "root";
            String password = "681219";
            Connection conn = DriverManager.getConnection(url,username,password);

            //输入用户名，密码
            String name = "zhangasdassan";
            //注入SQL
            String pass = "' or '1' = '1";

            //查询SQL语句
            String sql = "select * from tb_count where username = '"+name+"' and pass = '"+pass+"'";
            //select * from tb_count where username = 'zhangasdassan' and pass = '' or '1' = '1'
            System.out.println(sql);
            Statement stmt = conn.createStatement();
            //录入SQL
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()){
                //如果rs有数据就说明登录成功
                //登录成功
                //select * from tb_count where username = 'zhangasdassan' and pass = '' or '1' = '1'
                System.out.println("登录成功");
            }else{
                System.out.println("登录失败");
            }
            //释放资源
            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
