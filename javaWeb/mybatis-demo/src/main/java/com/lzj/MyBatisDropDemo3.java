package com.lzj;

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
 * 8:47
 */
public class MyBatisDropDemo3 {
    public static void main(String[] args) throws IOException {
        //加载核心配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取执行SQL语句mapper对象
//        DropMapper mapper = sqlSession.getMapper(DropMapper.class);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //返回删除行数
//        Inte inte = mapper.DeleteOne();
        List<User> users = userMapper.selectAll();
        //返回
//        System.out.println(inte);
        System.out.println(users);
        //释放资源
        sqlSession.close();
    }
}
