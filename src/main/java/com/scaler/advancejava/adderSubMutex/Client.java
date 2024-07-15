package com.scaler.advancejava.adderSubMutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();

        //Using Mutex here to lock and unlock the critical section of the code
        Adder adder = new Adder(count, lock);
        Subtractor sub = new Subtractor(count, lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(sub);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(count.value);
    }
}
