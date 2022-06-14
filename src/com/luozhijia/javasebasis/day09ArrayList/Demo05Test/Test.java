package com.luozhijia.javasebasis.day09ArrayList.Demo05Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-09
 * 17:30
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentData> list = new ArrayList<>();
        StudentData s1 = new StudentData("张三","heima01",18);
        StudentData s2 = new StudentData("李四","heima02",20);
        list.add(s1);
        list.add(s2);
        //登录界面
        System.out.println("欢迎进入学生用户管理系统");
        System.out.println("输入1登录系统");
        System.out.println("输入2注册系统");
        System.out.println("输入3忘记密码");
        start start = new start();
        int i = sc.nextInt();
        switch (i){
            case 1:     //登录
                denglu(list);
                break;
            case 2:     //注册
                zhuce(list);
                break;
            case 3:     //忘记密码
                zhaohui(list);
                break;
            default:
                System.out.println("数据错误");
                break;
        }

    }

    //忘记密码
    private static void zhaohui(ArrayList<StudentData> list) {
        //请输入账号
        System.out.println("请输入账号");
        start start = new start();
        Scanner sc = new Scanner(System.in);
        String re = sc.next();
        if (start.getPassword().equals(re)){
            //返回密码
            System.out.println(start.getCode());
            //重新登录
            System.out.println("请重新登录");


            System.out.println("请输入账号");
            String password = sc.next();
            System.out.println("请输入密码");
            String cd = sc.next();
            boolean b = start.dataEquese(password, cd);
            if (b){
                system: while (true){
                    System.out.println("请选择你要执行的操作");
                    System.out.println("输入数字1增加新的数据");
                    System.out.println("输入数字2删除选定数据");
                    System.out.println("输入数字3更改选定数据");
                    System.out.println("输入数字4查询选定数据");
                    System.out.println("输入0退出系统");  //输入0

                    Scanner code = new Scanner(System.in);
                    int code1 = code.nextInt();
                    switch(code1){
                        case 1:
                            //增加
                            xiugai(list);
                            break;
                        case 2:
                            //删除
                            rmdata(list);
                            break;
                        case 3:
                            //修改
                            modify(list);
                            break;
                        case 4:
                            //查询
                            chaxue(list);
                            break;
                        case 0:
                            break system;
                    }
                }
                System.out.println("系统结束");
            }else{
                System.out.println("登录错误");
            }
        }else{
            System.out.println("账号错误");
        }
    }

    private static void zhuce(ArrayList<StudentData> list){
        Scanner sc = new Scanner(System.in);
        start start = new start();
        System.out.println("请输入账号");
        String pd = sc.next();
        System.out.println("请输入密码");
        String cd1 = sc.next();
        start.yonghu(pd,cd1);
        System.out.println("再次输入密码");
        String Ecd1 = sc.next();
        if (Ecd1.equals(cd1)){
            System.out.println("注册成功");
            System.out.println("请登录");
            System.out.println("请输入密码");
            String cd2 = sc.next();
            boolean b = start.dataEquese(pd,cd2);
            if (b){
                system: while (true){
                    System.out.println("请选择你要执行的操作");
                    System.out.println("输入数字1增加新的数据");
                    System.out.println("输入数字2删除选定数据");
                    System.out.println("输入数字3更改选定数据");
                    System.out.println("输入数字4查询选定数据");
                    System.out.println("输入0退出系统");  //输入0

                    Scanner code = new Scanner(System.in);
                    int code1 = code.nextInt();
                    switch(code1){
                        case 1:
                            //增加
                            xiugai(list);
                            break;
                        case 2:
                            //删除
                            rmdata(list);
                            break;
                        case 3:
                            //修改
                            modify(list);
                            break;
                        case 4:
                            //查询
                            chaxue(list);
                            break;
                        case 0:
                            break system;
                    }
                }
                System.out.println("系统结束");
            }else{
                System.out.println("登录错误");
            }
        }else{
            System.out.println("密码错误");
        }
    }
    private static void denglu(ArrayList<StudentData> list){
        Scanner sc = new Scanner(System.in);
        start start = new start();
        System.out.println("请输入账号");
        String password = sc.next();
        System.out.println("请输入密码");
        String cd = sc.next();
        boolean b = start.dataEquese(password, cd);
        if (b){
            system: while (true){
                System.out.println("请选择你要执行的操作");
                System.out.println("输入数字1增加新的数据");
                System.out.println("输入数字2删除选定数据");
                System.out.println("输入数字3更改选定数据");
                System.out.println("输入数字4查询选定数据");
                System.out.println("输入0退出系统");  //输入0

                Scanner code = new Scanner(System.in);
                int code1 = code.nextInt();
                switch(code1){
                    case 1:
                        //增加
                        xiugai(list);
                        break;
                    case 2:
                        //删除
                        rmdata(list);
                        break;
                    case 3:
                        //修改
                        modify(list);
                        break;
                    case 4:
                        //查询
                        chaxue(list);
                        break;
                    case 0:
                        break system;
                }
            }
            System.out.println("系统结束");
        }else{
            System.out.println("登录错误");
        }
    }

    //修改数据
    private static void modify(ArrayList<StudentData> list) {
        System.out.println("请选择要修改的索引位置");
        Scanner sc = new Scanner(System.in);
        int pa = sc.nextInt();
        StudentData data = list.get(pa);
        System.out.println("学生姓名：" + data.getName() + ",学生学号：" + data.getPass() + ",学生年龄：" + data.getAge());
        System.out.println("输入1修改姓名");
        System.out.println("输入2修改学号");
        System.out.println("输入3修改年龄");
        int pa1 = sc.nextInt();
        switch (pa1){
            case 1:
                System.out.println("请输入要修改后的姓名");
                String name = sc.next();
                data.setName(name);
                System.out.println("修改成功");
                sl();
                break;
            case 2:
                System.out.println("请输入要修改后的学号");
                String pass = sc.next();
                data.setPass(pass);
                System.out.println("修改成功");
                sl();
                break;
            case 3:
                System.out.println("请输入要修改后的年龄");
                int age = sc.nextInt();
                data.setAge(age);
                System.out.println("修改成功");
                sl();
                break;
            default:
                System.out.println("输入的索引越界，数据无效");
                sl();
                break;
        }
    }

    //删除方法
    private static void rmdata(ArrayList<StudentData> list) {
        //选择要删除的索引位置
        Scanner sc = new Scanner(System.in);
        System.out.println("选择要删除的索引位置");
        int rm = sc.nextInt();
        StudentData remove = list.remove(rm);
        //返回删除的数据
        System.out.println("学生姓名：" + remove.getName() + ",学生学号：" + remove.getPass() + ",学生年龄：" + remove.getAge());
        System.out.println("删除成功");
        sl();
    }

    //查询方法
    private static void chaxue(ArrayList<StudentData> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入1查询全部");
        System.out.println("输入2查询指定数据");
        int pa = sc.nextInt();
        switch (pa){
            case 1:
                for (int i = 0; i < list.size(); i++) {
                    StudentData data = list.get(i);
                    System.out.println("学生姓名：" + data.getName() + ",学生学号：" + data.getPass() + ",学生年龄：" + data.getAge());
                    sl();
                }
                break;
            case 2:
                System.out.println("请输入指定索引位置");
                int code = sc.nextInt();
                if (code < list.size()){
                    StudentData data = list.get(code);   //索引越界隐患
                    System.out.println("学生姓名：" + data.getName() + "学生学号：" + data.getPass() + "学生年龄：" + data.getAge());
                    sl();
                }else{
                    System.out.println("索引越界，输入数据无效");
                    sl();
                }
                break;
            default:
                System.out.println("输入数据无效");
                sl();
                break;
        }
    }

    //修改方法
    public static void xiugai(ArrayList<StudentData> list){
        Scanner da = new Scanner(System.in);
        //录入信息
        System.out.println("请输入学生姓名");
        String name = da.next();
        System.out.println("请输入学号");
        String pass = da.next();
        System.out.println("请输入年龄");
        int age  = da.nextInt();
        //装入数据
        StudentData sd = new StudentData(name,pass,age);
        list.add(sd);
        //录入成功
        System.out.println("录入成功");
        sl();

    }

    //延时方法
    public static void sl(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
