package com.san.queue;

public class Queue {
    private int[] data;

    private static final int DEFAULT_SIZE = 10;

    private int end = 0;

    public Queue(){
        this(DEFAULT_SIZE);
    }

    public Queue(int size){
        this.data = new int[size];
    }

    public boolean enqueue(int n){
        if (this.isFull())
            return false;
        this.data[this.end++] = n;
        return true;
    }

    public int dequeue() throws Exception {
        if(this.isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = this.data[0];
        // shift the elements
        for (int i = 1; i < this.end; i++) {
            this.data[i-1] = this.data[i];
        }
        this.end--;
        return removed;
    }

    public boolean isFull(){
        return  this.end == this.data.length;
    }
    public boolean isEmpty(){
        return this.end == 0;
    }
    public void display(){
        for ( int i=0; i<this.end; i++) {
            System.out.print(this.data[i] + " ");
        }
        System.out.println();
    }
}
class implep {
    public static void main(String[] args) throws Exception {
//        Queue q = new Queue();
//        q.enqueue(45);
//        q.enqueue(13);
//        q.enqueue(1);
//        q.enqueue(1234);
//        q.display();
//        q.dequeue();
//        q.display();
        CircQ cq = new CircQ();
        cq.enqueue(456);
        cq.enqueue(4);
        cq.enqueue(1);
        cq.enqueue(1234);
        cq.display();
    }
}

class CircQ{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int end = 0;
    private int front = 0;
    private int size = 0;

    public CircQ(){
        this(DEFAULT_SIZE);
    }

    public CircQ(int size){
        this.data = new int[size];
    }

    public boolean enqueue(int n){
        if (this.isFull())
            return false;
        this.data[this.end] = n;
        this.end = this.end % this.data.length;
        this.size++;
        return true;
    }

    public int dequeue() throws Exception {
        if(this.isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = this.data[front];
        this.front = this.front % this.data.length;
        this.size--;
        return removed;
    }

    public boolean isFull(){
        return  this.size == this.data.length;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public int front() throws Exception {
        if (this.isEmpty())
            throw new Exception("Queue is Empty!");
        return this.data[front];
    }
    public void display(){
        int i = this.front;
        if (this.isEmpty())
            return;
        do {
            System.out.print(this.data[i] + " ");
            i++;
            i %= this.data.length;
        }while (i!=this.end);
        System.out.println();
    }
}
