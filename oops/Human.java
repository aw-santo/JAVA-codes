package com.san.oops;

public class Human {
    int age;
    String name;
    int salary;
    boolean is_married;
    static long population;

    public Human(int age, String name, int salary, boolean is_married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.is_married = is_married;
        Human.population+=1;
    }
}
