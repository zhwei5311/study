package com.study.SetExe;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonTest2 {

    public static void main(String[] args) {
        Set<People> personSet = new TreeSet<>(new Comparator<People>() {
            @Override
            public int compare(People p1, People p2) {
                int num = p1.getAge() - p2.getAge();
                int num2 = (num == 0) ? (p1.getName().compareTo(p2.getName())) : num;
                return num2;
            }
        });

        People people1 = new People("刘大", 29);
        People people2 = new People("胡三", 59);
        People people3 = new People("贺六", 33);
        People people4 = new People("王八", 37);
        People people5 = new People("赵十一", 28);
        People people6 = new People("白笑嫣", 20);
        People people7 = new People("白笑嫣", 20);

        personSet.add(people1);
        personSet.add(people2);
        personSet.add(people3);
        personSet.add(people4);
        personSet.add(people5);
        personSet.add(people6);
        personSet.add(people7);

        for(People people : personSet) {
            System.err.println(people.getName() + ": " + people.getAge());
        }
    }
}
