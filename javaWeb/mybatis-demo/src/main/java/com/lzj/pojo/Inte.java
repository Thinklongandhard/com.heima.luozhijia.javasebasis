package com.lzj.pojo;

/**
 * @anthor longway
 * @create 2022-07-04
 * 8:43
 */
public class Inte {
    private Integer coun;   //影响行数

    public Integer getCoun() {
        return coun;
    }

    public void setCoun(Integer coun) {
        this.coun = coun;
    }

    @Override
    public String toString() {
        return "Inte{" +
                "coun=" + coun +
                '}';
    }
}
