package com.luozhijia.javasebasis.day09ArrayList.Demo02ArrayList;

import java.util.ArrayList;

/**
 * @anthor longway
 * @create 2022-06-09
 * 16:03
 */
public class ArrayListSave {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();
        for (int j = 0; j < 11; j++) {
            List.add(j,"战三" + j);
        }
        //遍历
        for (int j = 0; j < List.size(); j++) {
            System.out.println(List.get(j));
        }
    }
}
