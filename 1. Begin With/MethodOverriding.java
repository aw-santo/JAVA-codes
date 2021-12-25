package com.company;

class A1{
    int a = 4455;
    public void show(){
        System.out.println("in A");
    }
}

class B1 extends A1{
    int a =45;
    @Override   // used to get compile ime error rather than logical error
    public void show(){
        super.show();
        System.out.println("in B "+super.a);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
//        A1 obj1 = new A1();
//        obj1.show();
//        B1 obj2 = new B1();
//        obj2.show();

    }
}
