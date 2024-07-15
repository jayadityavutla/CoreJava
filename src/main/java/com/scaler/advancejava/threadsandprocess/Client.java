package com.scaler.advancejava.threadsandprocess;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
            //thread.join();// Wait for each thread to complete before proceeding
        }
    }
}
