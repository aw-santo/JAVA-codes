package com.company;

interface Writer {
    void write();
}

class Pen implements Writer{
    public void write(){
        System.out.println("in pen");
    }
}

class Pencil implements Writer{
    public void write(){
        System.out.println("in pencil");
    }
}

class Kit{
    public void doSomething(Writer p){
        p.write();
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Kit k = new Kit();
// Pen p =new Pen();
// Pencil pc = new Pencil();
        Writer p1 = new Pen();
        Writer p2 = new Pencil();


        k.doSomething(p1);
    }
}
