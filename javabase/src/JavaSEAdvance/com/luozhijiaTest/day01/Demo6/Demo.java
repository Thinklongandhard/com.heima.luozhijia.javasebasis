package JavaSEAdvance.com.luozhijiaTest.day01.Demo6;

import java.util.Random;

/**
 * @anthor longway
 * @create 2022-06-19
 * 22:36
 */
public class Demo {
    public static void main(String[] args){
        int[] arr = new int[]{11,56,87,64,0,7};

        show(arr);
    }
    public static void show(int[] arr){
        Random r = new Random();
        int leng = 6;
        int i=0;
        int k=0;
        int t=0;
        int j=0;

        for(;i<leng;++i)
        {
            if(k==0)  //判断k等于0
            {
                arr[i]=r.nextInt(6); //数组的第一个元素赋值一个随机数
                k=k+1;  //k=1
            } else { //k 等于 1
                t=r.nextInt(6);  //给t一个随机数

                for(j=0;j<k;++j)  //遍历0到k k 等于 1
                {

                    if(arr[j]==t) //如果元素中有相等的
                    {
                        j=-1;  //重新循环 ++j == 0
                        t=r.nextInt(6); //继续给t一个随机数
                        continue;  //结束本次循环，此时j等于0 继续进行判断，知道t不等于arr数组中元素结束
                    }

                }
                arr[j]=t;  //此时的j=i
                ++k;//k等于2
            }


        }


        System.out.println();
        System.out.println();

        for(int kk=0;kk<arr.length;++kk)
        {
            System.out.println("第"+(kk+1)+"个数据是："+arr[kk]);
        }



    }
}
