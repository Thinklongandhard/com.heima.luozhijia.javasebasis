package com.lzj;

import com.lzj.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @anthor longway
 * @create 2022-07-03
 * 17:07
 */
/*
编码
	   定义pojo类
	   加载核心配置文件，获取SqlSessionFactory对象
	   获取SqlSession对象，执行SQL语句
	   释放资源
 */
public class MyBatisDemo {
    public static void main(String[] args) throws IOException {
        //加载核心配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取返回值结果
        //执行sql语句，传入唯一标识参数
        List<User> list = sqlSession.selectList("test.selectAll");

        //返回对象
        System.out.println(list);

        //释放资源
        sqlSession.close();
    }
}
