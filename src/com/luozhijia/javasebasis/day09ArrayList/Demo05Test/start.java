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
    //比对
    public boolean dataEquese(String password,String code){
        boolean d = false;
        if (this.password.equals(password) & this.code.equals(code)){
            d = true;
        }
        return d;
    }

}
