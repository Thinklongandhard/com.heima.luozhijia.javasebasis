import com.lzj.mapper.BrandMapper;
import com.lzj.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @anthor longway
 * @create 2022-07-04
 * 10:55
 */
public class MyBatisTest {
    


    @Test
    public void test() throws IOException {  //多条件查询
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";

        //封装
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        Brand brand = new Brand();
//        brand.setStatus(status);
//        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);


//        Map m = new HashMap();
//        m.put("status",status);
////        m.put("companyName",companyName);
//        m.put("brandName",brandName);

        //加载核心配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

//        List<Brand> selecttwo = mapper.selecttwo();
//        System.out.println(selecttwo);

        List<Brand> brands = mapper.selectother(brand);


        System.out.println(brands);

        sqlSession.close();
    }




//    @Test
//    public void testUpdate() throws IOException {  //多条件查询
//        int status = 1;
//        String companyName = "波导手机";
//        String brandName = "华为";
//        int ordered = 100;
//        String description = "手机中的战斗机";
//        int id = 3;
//
//
//        Brand brand = new Brand();
//        brand.setStatus(status);
////        brand.setBrandName(brandName);
//        brand.setCompanyName(companyName);
////        brand.setOrdered(ordered);
//        brand.setDescription(description);
//        brand.setId(id);
//
//        //加载核心配置文件
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        //Rolling back JDBC Connection这里默认是手动提交事务，我们可以修改为自动
////        SqlSession sqlSession = sqlSessionFactory.openSession();
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
//
////        List<Brand> selecttwo = mapper.selecttwo();
////        System.out.println(selecttwo);
//
//        int count = mapper.Update(brand);
//
//        sqlSession.commit();
//
//        System.out.println(count);
//
//        sqlSession.close();
//    }


    @Test
    public void testAddAll() throws IOException {  //添加数据

        int status = 1;
        String companyName = "波导手机";
        String brandName = "华为";
        int ordered = 100;
        String description = "手机中的战斗机";

        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrdered(ordered);
        brand.setDescription(description);

        //加载核心配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        mapper.Insert(brand);
        Integer id = brand.getId();
        System.out.println(id);  //7
        sqlSession.commit();


        sqlSession.close();
    }


    @Test
    public void testdeleteById() throws IOException {  //多条件查询
        int[] id = {3,4,5};



//        Map m = new HashMap();
//        m.put("status",status);
////        m.put("companyName",companyName);
//        m.put("brandName",brandName);

        //加载核心配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //Rolling back JDBC Connection这里默认是手动提交事务，我们可以修改为自动
//        SqlSession sqlSession = sqlSessionFactory.openSession();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

//        List<Brand> selecttwo = mapper.selecttwo();
//        System.out.println(selecttwo);

        int i = mapper.deleteById(id);
        System.out.println(i);


        sqlSession.close();
    }
}
