package com.study.exercise3;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setScore(-120);
        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            exceptionTest.checkScore(student.getScore());
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
