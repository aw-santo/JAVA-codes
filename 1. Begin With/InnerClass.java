package com.company;

class outer {
    int num;
    public void show(){
        System.out.println("outer class!");
    }

    static class inner {
        public void show(){
            System.out.println("inner class!");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        outer obj = new outer();
        obj.show();
//        outer.inner obj1 = obj.new inner();
        outer.inner obj1 = new outer.inner();
        obj1.show();

    }
}
