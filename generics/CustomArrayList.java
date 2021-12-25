package com.san.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int n){
        if (isFull()){
            resize();
        }
        this.data[size++] = n;
    }

    private boolean isFull(){
        return this.size == this.data.length;
    }
    private void resize(){
        int[] temp = new int[this.data.length*2];
        for (int i = 0; i < this.data.length; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }
    public int remove(){
        int num = this.data[--size];
        return num;
    }
    public int get(int n){
        return this.data[n];
    }
    public int size(){
        return this.size;
    }
    public void set(int n, int ind){
        this.data[ind] = n;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(this.data) +
                ", size="+ size +
                '}';
    }

    public static void main(String[] args){
//        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(6);
        try{
            System.out.println(4/0);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("heelo");
        }

//        for (int i = 0; i <= 15; i++) {
//            list.add(i*i);
//        }
//
//        System.out.println(list);
    }
}
