package com.scaler.advancejava.collectionsDemo;

public class Student {
    String name;
    int age;
    double psp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age, double psp) {
        this.name = name;
        this.age = age;
        this.psp = psp;
    }
}
