package com.luozhijia.JDBC.day01.Demo8YuBianYi;

import org.junit.Test;

import java.sql.*;

/**
 * @anthor longway
 * @create 2022-07-02
 * 16:24
 */
public class Demo {

    @Test
    public void test(){
        //注册
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //连接数据库
            //uesServerPrepStmts=true开启预编译
            String url = "jdbc:mysql://127.0.0.1:3306/dp1?useSSL=false&uesServerPrepStmts=true";
            String uesrname = "root";
            String password = "681219";
            Connection conn = DriverManager.getConnection(url,uesrname,password);



            //写一个SQL语句
            String name = "zhangsan";
            String pass = "1234";


            String sql = "select * from tb_count where username = ? and pass = ?";
            PreparedStatement prs = conn.prepareStatement(sql);
            //设置参数
            prs.setString(1,name);
            prs.setString(2,pass);

            //获取结果
            ResultSet ps = prs.executeQuery();
            //判断是否登录成功
            if (ps.next()){
                //有数据即登录成功
                System.out.println("登录成功");
            }else {
                System.out.println("登录失败");
            }

            //释放资源
            ps.close();
            prs.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
