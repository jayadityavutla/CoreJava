package com.scaler.advancejava.threadsandprocess;

public class NumberPrinter implements Runnable{
    private int number;
    private String name;

    public NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("We are printing " + number + ", Thread executing is " + Thread.currentThread().getName());
    }
}
