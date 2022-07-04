package com.luozhijia.JDBC.day01.Demo10.pojo;

/**
 * @anthor longway
 * @create 2022-07-02
 * 17:47
 */
public class Demo {
    // id 主键
    private Integer id;
    // 品牌名称
    private String brandName;
    // 企业名称
    private String companyName;
    // 排序字段
    private Integer ordered;
    // 描述信息
    private String description;
    //状态
    private Integer satrus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSatrus() {
        return satrus;
    }

    public void setSatrus(Integer satrus) {
        this.satrus = satrus;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", brand_name='" + brandName + '\'' +
                ", company_name='" + companyName + '\'' +
                ", ordered=" + ordered +
                ", description='" + description + '\'' +
                ", satrus=" + satrus +
                '}';
    }
}
