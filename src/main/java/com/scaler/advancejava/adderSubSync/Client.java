package com.scaler.advancejava.adderSubSync;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        //synchronized - Ensures that critical sections of code are accessed by only one thread at a time

        Adder adder = new Adder(count);
        Subtractor sub = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(sub);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(count.value);
    }
}
