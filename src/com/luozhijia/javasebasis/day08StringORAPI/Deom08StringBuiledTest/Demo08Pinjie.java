package com.luozhijia.javasebasis.day08StringORAPI.Deom08StringBuiledTest;

/**
 * @anthor longway
 * @create 2022-06-07
 * 18:49
 */
/*
* 要求：
*   将int数组中的数据转换成字符串，并按一定要求返回数据
* */
public class Demo08Pinjie {
    private int[] data;
    public Demo08Pinjie(int[] data){
        this.data = data;
    }
    public void pinjie(){
        //取出data中的每一个数据
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < data.length;i++){
            if (i != data.length-1){
                sb.append(data[i] + ",");
            }else{
                sb.append(data[i]);
            }
        }
        System.out.println("[" + sb.toString() + "]");
        /*//System.out.println(sb);   123
        String data = sb.toString();
        //获取每一个字符
        //定义一个插入数组接收
        char[] da = new char[data.length()];
        for (int i = 0;i < data.length();i++){
            da[i] = data.charAt(i);
        }
        String end = "";
        for (int i = 0;i < da.length;i++){
            if (i != da.length-1){
                end += da[i] + ",";
            }else {
                end += da[i];
            }
        }
        System.out.println("[" + end + "]");*/
    }

}
