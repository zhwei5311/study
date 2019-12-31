package com.study.SetExe;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PersonTest {
    public static void main(String[] args) {
        Set<Person> personSet = new TreeSet<>();

        Person person1 = new Person("刘大", 29);
        Person person2 = new Person("胡三",59);
        Person person3 = new Person("贺六",33);
        Person person4 = new Person("王八",37);
        Person person5 = new Person("赵十一",28);
        Person person6 = new Person("白笑嫣",20);
        Person person7 = new Person("白笑嫣",20);

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);
        personSet.add(person7);

        for(Person person : personSet) {
            System.err.println(person.getName() + ":" + person.getAge());
        }
    }
}
