package com.lzj.mapper;

import com.lzj.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @anthor longway
 * @create 2022-07-04
 * 11:37
 */
public interface BrandMapper {
//    List<Brand> selectone(@Param("status")int status, @Param("companyName")String companyName,
//                          @Param("brandName")String brandName);

//    List<Brand> selectone(Brand brand);
//    List<Brand> selectone(Map map);

    List<Brand> selecttwo();

    List<Brand> selectother(Brand brand);


    //动态修改属性
    int Update(Brand brand);


    /**
     * 批量删除元素
     */
    //ParamNameResolver封装参数的方法
    int deleteById(@Param("ids")int[] ids);
}
