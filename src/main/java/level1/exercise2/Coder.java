package com.study.exercise2;

/**
 * 姓名name，工号id，工资salary。行为：工作work()
 */

public class Coder {
    private String name;
    private double salary;
    public Coder(){

    }

    public Coder(String name,double salary) {
        this.name = name;
        this.salary = salary;
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

    public void work() {
        System.err.println("coding……");
    }
}
