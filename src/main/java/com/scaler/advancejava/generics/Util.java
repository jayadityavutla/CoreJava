package com.scaler.advancejava.generics;

public class Util<A, B> {
    A a;
    B b;

    public static <T> T getLastElement(T[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        return arr[arr.length-1];
    }
    public void nothing(A ar, B br){
        System.out.println("Do nothing -> ");
        System.out.print("A is " + ar + " ");
        System.out.println("B is " + br);
    }
}
