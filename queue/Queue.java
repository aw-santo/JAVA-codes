package com.san.queue;

public class Queue {
    private int front;
    private int rear;
    private int capacity;
    private int[] arr;
    private int size;

    public Queue(){
        this.front = this.rear = -1;
        this.capacity = 100;
        this.arr = new int[this.capacity];
        this.size = 0;
    }

    public int enqueue(int n){
        if (this.rear>=capacity){
            return -1;
        }
        this.arr[++this.rear] = n;
        if (this.front==-1)
            this.front++;

        this.size++;

        return 1;
    }

    public int dequeue(){
        if (this.front==-1){
            return Integer.MIN_VALUE;
        }
        int val = this.arr[this.front];
        this.front++;
        this.size--;
        if (this.rear<this.front){
            this.front=this.rear = -1;
            this.size = 0;
        }

        return val;
    }

    public int getFront(){
        return this.size==0 ? this.front : this.arr[this.front];
    }
    public int getRear(){
        return this.size==0 ? this.rear : this.arr[this.rear];
    }
    public int getSize(){
        return this.size;
    }
    public int getCapacity(){
        return this.capacity;
    }


}
class implep{
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(565);
        q.dequeue();
        System.out.println(q.getCapacity());
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        System.out.println(q.getSize());

    }
}
