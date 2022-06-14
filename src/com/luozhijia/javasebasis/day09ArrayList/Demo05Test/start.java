package com.luozhijia.javasebasis.day09ArrayList.Demo05Test;

/**
 * @anthor longway
 * @create 2022-06-14
 * 10:13
 */

//登录界面

public class start {
    private String password = "ll1952860311";
    private String code = "681219ll";
    //登录
    public boolean dataEquese(String password,String code){
        boolean d = false;
        if (this.password.equals(password) & this.code.equals(code)){
            d = true;
        }
        return d;
    }
    //注册
    public void yonghu(String password,String code){
        setCode(code);
        setPassword(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
