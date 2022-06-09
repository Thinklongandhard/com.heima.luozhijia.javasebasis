package com.luozhijia.javasebasis.day08StringORAPI.Deom07StringBuiled;

/**
 * @anthor longway
 * @create 2022-06-07
 * 17:52
 */
public class StringBuiled01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        //10   毫秒
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < 50000;i++){
            sb.append(i);
        }

        System.out.println(sb);

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

//    private static void extracted() {
//        long start = System.currentTimeMillis();  //用来返回1970到现在的毫秒数
//
//        //7255   7秒
//        String s = "";
//        for (int i = 0;i < 50000;i++){
//            s += i;
//        }
//
//        System.out.println(s);
//
//        long end = System.currentTimeMillis(); //两个时间节点
//        System.out.println(end - start);
//    }
}
