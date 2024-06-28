package com.scaler.advancejava.executor;

public class NumberPrinter implements Runnable{
    private int number;

    public NumberPrinter(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println("We are printing " + number + ", Thread executing is " + Thread.currentThread().getName());
    }
}
