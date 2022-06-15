package JavaSEAdvance.com.luozhijia.day03.Demo06;

public class Mather {
    public int[] paixu(int[] num) {
        //键盘录入数据
        //num中录入了数据
        //排序
        int temp = 0;
        for (int j = 0; j < 5; j++) {
            int max = num[0];  //假设第一个是最大值
            for (int i = 1; i <= num.length-1; i++) {
                if (max > num[i]){
                    temp = num[i];
                    num[i] = max;
                    num[i-1] = temp;
                }
            }
        }
        return num;
    }
}
