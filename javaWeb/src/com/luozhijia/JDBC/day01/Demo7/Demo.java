package com.luozhijia.JDBC.day01.Demo7;

import org.junit.Test;

import java.sql.*;

/**
 * @anthor longway
 * @create 2022-07-02
 * 15:35
 */
public class Demo {

    @Test
    public void test(){
        //使用PreparedStatement
        //注册MySQL
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //登录
            String url = "jdbc:mysql://127.0.0.1:3306/dp1?useSSL=false";
            String username = "root";
            String password = "681219";
            Connection conn = DriverManager.getConnection(url, username, password);
            //写一个SQL语句
            String sql = "select * from tb_count where username = ? and pass = ?";
            //创建PreparedStatement对象
            PreparedStatement prest = conn.prepareStatement(sql);
            //设置两个？的参数值
            /*
            设置参数值
	          PreparedStatement对象：setXxx(参数1，参数2): 给？赋值
	          Xxx: 数据类型；如 setInt(参数1，参数2)
	        参数
	          参数1: ?的位置编号，从1开始
		      参数2: ?的值
             */
            prest.setString(1,"zhangsan");
            prest.setString(2,"1234");
            //传入数据
            ResultSet rs = prest.executeQuery();

            //查看rs中是否有数据
            if (rs.next()){
                //有数据说明登录成功
                System.out.println("登录成功");
            }else {
                System.out.println("登录失败");
            }

            //释放资源
            rs.close();
            prest.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
