package com.company;

public class Dog {

    String name;
    private int numberOfLegs;

    public Dog() {
        this.numberOfLegs = 4;
    }

    public Dog(String name) {
        this();
        this.name = name;

    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void bark(){
        System.out.println("hau hau");
    }

    public static void sayHau(){
        System.out.println("Say hau");
    }

    public String getName() {
        return name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
