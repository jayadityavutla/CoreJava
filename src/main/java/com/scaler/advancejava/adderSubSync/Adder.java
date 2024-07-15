package com.scaler.advancejava.adderSubSync;

public class Adder implements Runnable {
    private Count count;
    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<100000000; i++){
            //Critical section of the code
            //synchronized - Ensures that critical sections of code are accessed by only one thread at a time
            synchronized(count){
                count.value += 1;
            }
        }
    }
}
