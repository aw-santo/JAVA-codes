package com.san.oops;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println(Human.population);
        Human sanket = new Human(19, "sanket", 500, false);
        System.out.println(Human.population);
        Human shruti = new Human(20, "shruti", 1000, false);
        System.out.println(Human.population);

        System.out.println(sanket.name);
        System.out.println(shruti.salary);
    }
}
class A{
    void greet(){
        System.out.println("Hello");
    }
    void greet(int a){
        System.out.println(a);
    }
    int greet(int a, int b){
        System.out.println("helo");
        return 0;
    }

}
