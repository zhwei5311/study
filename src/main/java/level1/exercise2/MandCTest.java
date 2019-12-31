package com.study.exercise2;

/**
 * 定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
 *  调用成员方法,打印格式如下:
 *  ```
 *  工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
 *  工号为135基本工资为10000的程序员正在努力的写着代码......
 */
public class MandCTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("贺六");
        manager.setId("6");
        manager.setSalary(300);
        manager.setBonus(50000);
        Coder coder = new Coder();
        coder.setName("老胡");
        coder.setSalary(500);
        System.err.println("工号为" + manager.getId() + manager.getName() +"基本工资为" + manager.getSalary() +
                "奖金为" + manager.getBonus() + "的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
        System.err.println(coder.getName() + "基本工资为" + coder.getSalary() + "的程序员正在努力的写着代码......");
    }
}
