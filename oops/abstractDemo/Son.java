package com.san.oops.abstractDemo;

public class Son extends Parent{
    @Override
    void career(String name){
        System.out.println("I am "+name);
    }

    @Override
    void partner(String name, int age){
        System.out.println("My lub: "+name+" she is "+age);
    }
}
