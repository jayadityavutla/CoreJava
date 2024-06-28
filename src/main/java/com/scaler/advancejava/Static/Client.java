package com.scaler.advancejava.Static;

public class Client {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Animal();
        Animal.staticCall();
        animal2.staticCall();//static methods should be called from Class reference, object reference unnecessary
        animal2.nonStaticCall();
    }
}
