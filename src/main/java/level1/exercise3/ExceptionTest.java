package com.study.exercise3;

/**
 * 请使用代码实现
 * 每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
 * 如果老师给学生赋值一个负数,抛出一个自定异常
 */
public class ExceptionTest {
    public void checkScore(int score) throws ScoreException {
        if(score < 0) {
            throw new ScoreException("您输入的是一个负数，脑子绝对进水了！");
        } else {
            System.err.println("分数正常！");
        }
    }
}
