package com.company;

class Counter {
    int count;
    public synchronized void increment() {
        count++; // if t1 is working t2 has to wait and vice versa!
    }
}

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=1; i<=1000; i++){
                        c.increment();
                    }
                }
            });
        Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=1; i<=1000; i++){
                        c.increment();
                    }
                }
            });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("-> "+c.count);
    }
}
