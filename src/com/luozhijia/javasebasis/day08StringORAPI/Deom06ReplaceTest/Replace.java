package com.luozhijia.javasebasis.day08StringORAPI.Deom06ReplaceTest;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-07
 * 17:12
 */
public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String S1 = s.replace("tmd","***");
        System.out.println(S1);
    }
}
