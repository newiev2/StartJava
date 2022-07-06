package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.setName("Axel");
        wolf1.setSex("Male");
        wolf1.setColor("Grey");
        wolf1.setAge(9);
        wolf1.setWeight(18.5f);
        System.out.println("name: " + wolf1.getName());
        System.out.println("sex: " + wolf1.getSex());
        System.out.println("color: " + wolf1.getColor());
        System.out.println("age: " + wolf1.getAge());
        System.out.println("weight: " + wolf1.getWeight());
    }
}