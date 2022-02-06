package com.san.stack;

public class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public Stack(){
        this(DEFAULT_SIZE);
    }

    public Stack(int size){
        this.data = new int[size];
    }

    public boolean push(int n){
        if(this.isFull()){
            System.out.println("Stack is full");
            return false;
        }

        this.data[++this.ptr] = n;
        return  true;
    }

    private boolean isFull(){
        return this.ptr == data.length-1;
    }

    private boolean isEmpty(){
        return this.ptr == -1;
    }
    public int pop() throws Exception{
        if (this.isEmpty()){
            System.out.println("Stack is empty!");
            throw new Exception("Cannot pop from empty stack")
        }
        return this.data[this.ptr--];
    }

    public int peek() throws Exception{
        if (this.isEmpty())
            throw new Exception("Cannot peek into an empty stack")
        return this.data[ptr];
    }
}
class imple {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(3);
        st.push(654);
        st.push(8);
        st.push(4);
    }
}
