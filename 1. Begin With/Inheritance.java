package com.company;

class Calc1{
    public int add(int i, int j){
        return i+j;
    }
}

class Calc2 extends Calc1 {
    public int sub(int i, int j){
        return i-j;
    }
}

class Calc3 extends Calc2 {
    public int multi(int i, int j){
        return i*j;
    }
}

public class Inheritance {
    public static void main(String[] args) {
//        Calc1 obj1 = new Calc1();
//        Calc2 obj2 = new Calc2();
        Calc3 obj3 = new Calc3();
        System.out.println(obj3.add(4, 2));
        System.out.println(obj3.sub(4, 2));
        System.out.println(obj3.multi(4, 2));
    }
}
