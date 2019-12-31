package com.study.SetExe;

import java.util.Objects;

/**
 * 定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，姓名和年龄相同的人看做同一人不存储
 */
public class Person implements Comparable<Person> {
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        int num = this.name.compareTo(person.name);
        int num2 = num == 0 ? (this.age - person.age) : num;
        return num2;
    }
}
