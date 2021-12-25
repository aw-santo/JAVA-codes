package com.san.generics;

import java.util.Arrays;

public class CustomArrayListGenerics<T extends Number> {


    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayListGenerics() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T n){
        if (isFull()){
            resize();
        }
        this.data[size++] = n;
    }

    private boolean isFull(){
        return this.size == this.data.length;
    }
    private void resize(){
        Object[] temp = new Object[this.data.length*2];
        for (int i = 0; i < this.data.length; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }
    public T remove(){
        T num = (T)(this.data[--size]);
        return num;
    }
    public T get(int n){
        return (T)(this.data[n]);
    }
    public int size(){
        return this.size;
    }
    public void set(T n, int ind){
        this.data[ind] = n;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(this.data) +
                ", size="+ size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayListGenerics<Integer> list2 = new CustomArrayListGenerics<>();
        list2.add(45);
        for (int i = 0; i < 15; i++) {
            list2.add(i*i);
        }
        System.out.println(list2);
    }

}
