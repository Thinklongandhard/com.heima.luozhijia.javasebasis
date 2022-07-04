package com.lzj;

import com.lzj.mapper.AddMapper;
import com.lzj.mapper.UserMapper;
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
 * @create 2022-07-04
 * 9:01
 */
public class MyBatisAddDemo4 {
    public static void main(String[] args) throws IOException {
        //加载核心配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取代理对象
        AddMapper add = sqlSession.getMapper(AddMapper.class);
        UserMapper user = sqlSession.getMapper(UserMapper.class);

//        Inte inte = add.addone();
        List<User> users = user.selectAll();

        //返回值
//        System.out.println(inte);
        System.out.println(users);

        //释放资源
        sqlSession.close();
    }
}
