package com.san.linkedList;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int data){
        Node n = new Node(data);
        if (this.head==null){
            this.head = n;
            this.tail = n;
            return;
        }
        this.tail.next = n;
        n.next = this.head;
        this.tail = n;
    }

    public void display(){
        Node temp = this.head;
        if (this.head==null){
            return;
        }
        do {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }while (temp!=head);
        System.out.println("LOOP");
    }

    public void delete(int val){
        if (this.head==null){
            return;
        }
        Node temp = this.head;
        if (temp.data == val){
            this.head = this.head.next;
            this.tail.next = this.head;
            return;
        }
        while (temp != this.tail){
            if (temp.next.data == val){
                break;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
