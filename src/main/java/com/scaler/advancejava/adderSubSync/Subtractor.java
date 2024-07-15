package com.scaler.advancejava.adderSubSync;

public class Subtractor implements Runnable {
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000000; i++) {
            synchronized(count){
                count.value -= 1;
            }
        }
    }
}
