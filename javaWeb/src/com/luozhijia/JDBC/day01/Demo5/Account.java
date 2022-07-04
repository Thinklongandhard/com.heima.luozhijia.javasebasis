package com.luozhijia.JDBC.day01.Demo5;

/**
 * @anthor longway
 * @create 2022-07-02
 * 14:32
 */
public class Account {
    private int id;
    private String name;
    private double salary;

    public Account() {
    }

    public Account(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
