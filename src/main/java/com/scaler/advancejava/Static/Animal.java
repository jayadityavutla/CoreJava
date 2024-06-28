package com.scaler.advancejava.Static;

public class Animal {
    public int nonStaticVal = 1;
    public static int staticVal = 1;
    public Animal() {
        staticVal++;
    }

    public static void staticCall(){
        System.out.println("staticVal = " + staticVal);
    }
    public void nonStaticCall(){
        System.out.println("nonStaticVal = " + nonStaticVal);
    }
}
