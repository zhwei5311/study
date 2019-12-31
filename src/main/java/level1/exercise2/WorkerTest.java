package com.study.exercise2;

/**
 * 请录入工人姓名：
 * 张三
 * 请录入工人工龄：
 * 5
 * 该工人对象的属性信息如下：
 * 姓名：张三
 * 工龄：5
 * ```
 */
public class WorkerTest {
    public static void main(String[] args) {
        Worker worker = new Worker("张三","5");
        System.err.println(worker.getName() + "的工龄是" + worker.getYear());
    }
}
