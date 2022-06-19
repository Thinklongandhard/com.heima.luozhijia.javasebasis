package JavaSEAdvance.com.luozhijia.day07.MapDemo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @anthor longway
 * @create 2022-06-18
 * 10:12
 */
//创建Map集合传入参数
public class Demo01Map {
    public static void main(String[] args) {
        //创建对象
        Map<String,Integer> m = new HashMap<String,Integer>();

        m.put("luo",10);
        m.put("zhi",11);
        m.put("jia",12);

        System.out.println(m);
    }
}
