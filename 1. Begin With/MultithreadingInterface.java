package com.company;

/*class Hi1 implements Runnable{
    public void run(){
        for (byte i=0; i<=5; i++) {
            System.out.println("Hi1");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello1 implements Runnable{
    public void run(){
        for (byte i=0; i<=5; i++) {
            System.out.println("Hello1");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}*/


public class MultithreadingInterface {
    public static void main(String[] args) throws Exception {
//        Hi1 obj1 = new Hi1();
//        Hello1 obj2 = new Hello1();
//        Runnable obj1 = new Hi1();
//        Runnable obj2 = new Hello1();
        /*Runnable obj1 = new Runnable() {
            @Override
            public void run() {
                for (byte i=0; i<=5; i++) {
                    System.out.println("Hi1");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable obj2 = new Runnable() {
            @Override
            public void run() {
                for (byte i=0; i<=5; i++) {
                    System.out.println("Hello1");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };*/

        /*Runnable obj1 = () -> {
            for (byte i = 0; i <= 5; i++) {
                System.out.println("Hi1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> {
                    for (byte i=0; i<=5; i++) {
                        System.out.println("Hello1");
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }; */

//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);
        Thread t1 = new Thread(() -> {
            for (byte i = 0; i <= 5; i++) {
                System.out.println("Hi1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "san");  // name of t1
        Thread t2 = new Thread(() -> {
            for (byte i=0; i<=5; i++) {
                System.out.println("Hello1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "shr"); // name of t2

//        t1.setName("san");   // to set name of the thread
//        t2.setName("shr");
//        System.out.println(t1.getName());   / to get the name of the thread
//        System.out.println(t2.getName());

//        t1.setPriority(1);  // to set priority
//        t2.setPriority(10);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getPriority());  // to get priority
        System.out.println(t2.getPriority());

        t1.start();
        try {Thread.sleep(10);} catch (Exception e){}
        t2.start();

        t1.join(); // won't execute further instructions until this particular tread is either dead or interrupted!
        t2.join();
        System.out.println(t1.isAlive()); // boolean of the thread is alive or dead!
        System.out.println("Bye");

//        obj1.start();
//        obj2.start();
    }
}
