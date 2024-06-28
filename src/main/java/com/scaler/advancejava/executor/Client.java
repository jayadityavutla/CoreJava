package com.scaler.advancejava.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //Executor executor = Executors.newCachedThreadPool();
        Executor executor = Executors.newFixedThreadPool(10);
        for(int i = 0; i < 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executor.execute(numberPrinter);
        }
    }
}
