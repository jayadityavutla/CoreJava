package com.scaler.advancejava;

import com.scaler.advancejava.executor.NumberPrinter;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(10);
        //Executor executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executor.execute(numberPrinter);
        }
    }
}
