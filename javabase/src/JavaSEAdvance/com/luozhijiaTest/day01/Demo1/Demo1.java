package JavaSEAdvance.com.luozhijiaTest.day01.Demo1;

/**
 * @anthor longway
 * @create 2022-06-19
 * 17:48
 */
public class Demo1 {
    private String pinpai;
    private String pass;
    private String colors;
    private int money;

    public Demo1() {
    }

    public Demo1(String pinpai, String pass, String colors, int money) {
        this.pinpai = pinpai;
        this.pass = pass;
        this.colors = colors;
        this.money = money;
    }

    public String getPinpai() {
        return pinpai;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
