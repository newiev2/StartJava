package com.startjava.lesson_2_3.animal;

public class Wolf {

    private String name;
    private String sex;
    private String color;
    private int age;
    private float weight;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Age is incorrect!");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void move() {
        System.out.println("Wolf start moving");
    }

    public void sit() {
        System.out.println("Wolf just sat");
    }

    public void run() {
        System.out.println("Wolf start running");
    }

    public void howl() {
        System.out.println("Awuuuuuuuu!!!");
    }

    public void hunt() {
        System.out.println("Wolf start hunting its prey");
    }
}