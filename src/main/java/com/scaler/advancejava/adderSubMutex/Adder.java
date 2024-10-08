package com.scaler.advancejava.adderSubMutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;
    private Lock lock;
    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            lock.lock();
            count.value += 1;//Critical section of the code
            lock.unlock();
        }
    }
}
