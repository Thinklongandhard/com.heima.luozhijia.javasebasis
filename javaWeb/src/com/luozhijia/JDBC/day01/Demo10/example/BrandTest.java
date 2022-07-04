package com.luozhijia.JDBC.day01.Demo10.example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.luozhijia.JDBC.day01.Demo10.pojo.Demo;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

/**
 * @anthor longway
 * @create 2022-07-02
 * 17:57
 */
/*
品牌数据的增删改查操作
 */
public class BrandTest {

//    //查询所有数据
//    @Test
//    public void test1(){
//        //使用配置文件
//        Properties pro = new Properties();
//        //创建集合对象
//        ArrayList<Demo> list = new ArrayList<Demo>();
//        //创建实体类对象
////        System.out.println(System.getProperty("user.dir"));
//        try {
//            pro.load(new FileInputStream("E://work2020//IDEA//IDEAProject//com.heima.luozhijia.javasebasis//javaWeb//src//druid.properties"));
//            //创建Druid数据库连接池
//            DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
//            //获取连接
//            Connection conn = dataSource.getConnection();
//            //查询表
//            String sql = "select * from tb_brand";
//            //获取PreparedStatement
//            PreparedStatement pres = conn.prepareStatement(sql);
//            //传入SQL语句
//            ResultSet rs = pres.executeQuery();
//            //收集数据
//            while (rs.next()){
//                Demo d = new Demo();
//                d.setId(rs.getInt(1));
//                d.setBrandName(rs.getString("brand_name"));
//                d.setCompanyName(rs.getString("company_name"));
//                d.setOrdered(rs.getInt(4));
//                d.setDescription(rs.getString(5));
//                d.setSatrus(rs.getInt(6));
//                list.add(d);
//            }
//            //输出集合
//            for (Demo d : list){
//                System.out.println("Demo{" +
//                        "id=" + d.getId() +
//                        ", brand_name='" + d.getBrandName() + '\'' +
//                        ", company_name='" + d.getCompanyName() + '\'' +
//                        ", ordered=" + d.getOrdered() +
//                        ", description='" + d.getDescription() + '\'' +
//                        ", satrus=" + d.getSatrus() +
//                        '}');
//            }
//
//            //释放资源
//            rs.close();
//            pres.close();
//            conn.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


//    //添加数据
//    @Test
//    public void test2(){
//        //使用配置文件
//        Properties pro = new Properties();
//        //创建集合对象
//        ArrayList<Demo> list = new ArrayList<Demo>();
//        //创建实体类对象
////        System.out.println(System.getProperty("user.dir"));
//        try {
//            pro.load(new FileInputStream("E://work2020//IDEA//IDEAProject//com.heima.luozhijia.javasebasis//javaWeb//src//druid.properties"));
//            //创建Druid数据库连接池
//            DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
//            //获取连接
//            Connection conn = dataSource.getConnection();
//            //添加数据
//            /*
//            -- id 主键  brand_name    company_name    ordered    description    status
//             */
//            //insert into tb_brand (brand_name, company_name, ordered, description, status)
//            //values ('三只松鼠', '三只松鼠股份有限公司', 5, '好吃不上火', 0),
//            //       ('华为', '华为技术有限公司', 100, '华为致力于把数字世界带入每个人、每个家庭、每个组织，构建万物互联的智能世界', 1),
//            //       ('小米', '小米科技有限公司', 50, 'are you ok', 1);
//            String sql1 = "insert into tb_brand (brand_name, company_name, ordered, description, status) values ('荣耀','华为荣耀有限公司',60,'你是我的神',1)";
//            //insert into tb_brand add (id,brand_name,company_name,ordered,description,status)
//            // values (4,'荣耀','华为荣耀有限公司',60,'你是我的神',1)
////            System.out.println(sql);
//            //查询语句
//            String sql2 = "select * from tb_brand";
//
//            //获取PreparedStatement
//            PreparedStatement pres = conn.prepareStatement(sql1);
//            PreparedStatement pres1 = conn.prepareStatement(sql2);
//            //传入SQL语句
//            int rs1 = pres.executeUpdate();
//            if (rs1 > 0){
//                System.out.println("上传成功");
//            }else {
//                System.out.println("上传失败");
//            }
//            ResultSet rs2 = pres1.executeQuery();
//            while (rs2.next()){
//                Demo d = new Demo();
//                d.setId(rs2.getInt(1));
//                d.setBrandName(rs2.getString("brand_name"));
//                d.setCompanyName(rs2.getString("company_name"));
//                d.setOrdered(rs2.getInt(4));
//                d.setDescription(rs2.getString(5));
//                d.setSatrus(rs2.getInt(6));
//                list.add(d);
//            }
//            //输出集合
//            for (Demo d : list){
//                System.out.println("Demo{" +
//                        "id=" + d.getId() +
//                        ", brand_name='" + d.getBrandName() + '\'' +
//                        ", company_name='" + d.getCompanyName() + '\'' +
//                        ", ordered=" + d.getOrdered() +
//                        ", description='" + d.getDescription() + '\'' +
//                        ", satrus=" + d.getSatrus() +
//                        '}');
//            }
//
//            //释放资源
//            rs2.close();
//            pres.close();
//            conn.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    //删除元素
//    @Test
//    public void test3(){
//        //使用配置文件
//        Properties pro = new Properties();
//        //创建集合对象
//        ArrayList<Demo> list = new ArrayList<Demo>();
//        //创建实体类对象
////        System.out.println(System.getProperty("user.dir"));
//        try {
//            pro.load(new FileInputStream("E://work2020//IDEA//IDEAProject//com.heima.luozhijia.javasebasis//javaWeb//src//druid.properties"));
//            //创建Druid数据库连接池
//            DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
//            //获取连接
//            Connection conn = dataSource.getConnection();
//            //添加数据
//            /*
//            -- id 主键  brand_name    company_name    ordered    description    status
//             */
//            String sql1 = "delete from tb_brand where id = 4";
//            //insert into tb_brand add (id,brand_name,company_name,ordered,description,status)
//            // values (4,'荣耀','华为荣耀有限公司',60,'你是我的神',1)
////            System.out.println(sql);
//            //查询语句
//            String sql2 = "select * from tb_brand";
//
//            //获取PreparedStatement
//            PreparedStatement pres = conn.prepareStatement(sql1);
//            PreparedStatement pres1 = conn.prepareStatement(sql2);
//            //传入SQL语句
//            int rs1 = pres.executeUpdate();
//            if (rs1 > 0){
//                System.out.println("删除成功");
//            }else {
//                System.out.println("上传失败");
//            }
//            ResultSet rs2 = pres1.executeQuery();
//            while (rs2.next()){
//                Demo d = new Demo();
//                d.setId(rs2.getInt(1));
//                d.setBrandName(rs2.getString("brand_name"));
//                d.setCompanyName(rs2.getString("company_name"));
//                d.setOrdered(rs2.getInt(4));
//                d.setDescription(rs2.getString(5));
//                d.setSatrus(rs2.getInt(6));
//                list.add(d);
//            }
//            //输出集合
//            for (Demo d : list){
//                System.out.println("Demo{" +
//                        "id=" + d.getId() +
//                        ", brand_name='" + d.getBrandName() + '\'' +
//                        ", company_name='" + d.getCompanyName() + '\'' +
//                        ", ordered=" + d.getOrdered() +
//                        ", description='" + d.getDescription() + '\'' +
//                        ", satrus=" + d.getSatrus() +
//                        '}');
//            }
//
//            //释放资源
//            rs2.close();
//            pres.close();
//            conn.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

    //修改数据根据id
    @Test
    public void test4(){
        //使用配置文件
        Properties pro = new Properties();
        //创建集合对象
        ArrayList<Demo> list = new ArrayList<Demo>();
        //创建实体类对象
//        System.out.println(System.getProperty("user.dir"));
        try {
            pro.load(new FileInputStream("E://work2020//IDEA//IDEAProject//com.heima.luozhijia.javasebasis//javaWeb//src//druid.properties"));
            //创建Druid数据库连接池
            DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
            //获取连接
            Connection conn = dataSource.getConnection();

            //修改数据
            //     update 表名 set  列名1 = 值1，列名2 = 值2，...[where 条件]
            /*
            -- id 主键  brand_name    company_name    ordered    description    status
             */
            String sql1 = "update tb_brand set brand_name = '荣耀',company_name = '华为荣耀有限公司' where id = 3";
            //insert into tb_brand add (id,brand_name,company_name,ordered,description,status)
            // values (4,'荣耀','华为荣耀有限公司',60,'你是我的神',1)
//            System.out.println(sql);
            //查询语句
            String sql2 = "select * from tb_brand";

            //获取PreparedStatement
            PreparedStatement pres = conn.prepareStatement(sql1);
            PreparedStatement pres1 = conn.prepareStatement(sql2);
            //传入SQL语句
            int rs1 = pres.executeUpdate();
            if (rs1 > 0){
                System.out.println("修改成功");
            }else {
                System.out.println("修改失败");
            }
            ResultSet rs2 = pres1.executeQuery();
            while (rs2.next()){
                Demo d = new Demo();
                d.setId(rs2.getInt(1));
                d.setBrandName(rs2.getString("brand_name"));
                d.setCompanyName(rs2.getString("company_name"));
                d.setOrdered(rs2.getInt(4));
                d.setDescription(rs2.getString(5));
                d.setSatrus(rs2.getInt(6));
                list.add(d);
            }
            //输出集合
            for (Demo d : list){
                System.out.println("Demo{" +
                        "id=" + d.getId() +
                        ", brand_name='" + d.getBrandName() + '\'' +
                        ", company_name='" + d.getCompanyName() + '\'' +
                        ", ordered=" + d.getOrdered() +
                        ", description='" + d.getDescription() + '\'' +
                        ", satrus=" + d.getSatrus() +
                        '}');
            }

            //释放资源
            rs2.close();
            pres.close();
            conn.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
