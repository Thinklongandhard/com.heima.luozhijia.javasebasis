package javaSE.day03Homework.DemoAdvance05;

import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-14
 * 21:41
 */

/*
假设一个简单的在ATM的取款过程如下：首先提示用户输入密码（password），
        最多只能输入3次，超过3次则提示用户"密码错误，请取卡"交易结束。
        如果用户密码正确，再提示用户输入金额（amount），ATM只能输出100元的纸币，一次取钱数要求最低0元，最高1000元。
        如果用户输入的金额符合上述要求，则打印输出用户取的钱数，最后提示用户"交易完成，请取卡"，否则提示用户重新输入金额。假设用户密码是"111111"。
*/
public class bank {
    public static String password = "681219l";
    public static int amount = 10000;
    public static void main(String[] args) {
        System.out.println("请输入密码");
        Scanner sc = new Scanner(System.in);
        String pd = null;
        int am = 0;
        for (int i = 0; i < 3; i++) {
            pd = sc.next();
            if (password.equals(pd)){
                System.out.println("登录成功");
                System.out.println("请输入金额");
                am = sc.nextInt();
                if ((am%100)==0 & am<=1000){
                    amount = amount - am;
                    System.out.println("交易完成，请取卡");
                }else{
                    System.out.println("取钱失败");
                }
            }else{
                System.out.println("登录失败");
            }
        }
    }
}
