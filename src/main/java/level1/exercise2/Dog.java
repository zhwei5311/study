package com.study.exercise2;

public class Dog {
    private String color;
    private String breed;

    public Dog(){

    }

    public Dog(String color,String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat() {
        System.err.println(color + breed + "啃骨头");
    }

    public void lookHome() {
        System.err.println(color + breed + "看家");
    }
}
