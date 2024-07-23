package com.scaler.advancejava.designPatterns.builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("Jay")
                .setAge(24)
                .setBatch("2017")
                .setPsp(80)
                .setGradYear(2021)
                .setUniversity("SRM")
                .build();

        System.out.println("Debug starts");
    }
}
