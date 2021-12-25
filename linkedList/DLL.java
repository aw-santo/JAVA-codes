package com.san.linkedList;

import com.sun.security.auth.NTDomainPrincipal;

import java.util.IllegalFormatCodePointException;

public class DLL {
    private Node head;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertAtHead(int data){
        Node n = new Node(data);
        n.next = this.head;
        if (this.head != null){
            this.head.prev = n;
        }
        this.head = n;
        this.size++;
    }

    public void insertAtTail(int data){
        Node n = new Node(data);
        if (head==null){
            this.insertAtHead(data);
            return;
        }
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
        n.prev = temp;
        n.next = null;
        this.size++;
    }

    public void insertAfter(int data, int key){
        Node temp = this.head;
        while (temp!=null){
            if (temp.data == key){
                break;
            }
            temp = temp.next;
        }
        Node n = new Node(data);
        n.next = temp.next;
        n.prev = temp;
        if (temp.next!=null){
            temp.next.prev = n;
        }
        temp.next = n;
        this.size++;
    }

    public void display(){
        Node n = this.head;
        while (n!=null){
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("END");
    }

    public void displayRev(){
        Node n = this.head;
        while (n.next!=null){
            n = n.next;
        }
        while (n!=null){
            System.out.print(n.data + " -> ");
            n = n.prev;
        }
        System.out.println("START");
    }

    public int getSize() {
        return size;
    }

    public int deleteAtHead(){
        if (this.head==null){
            return Integer.MIN_VALUE;
        }
        int val = this.head.data;
        this.head = this.head.next;
        this.head.prev = null;
        this.size--;
        return val;
    }

    public int deleteAtTail(){
        if (this.head==null){
            return Integer.MIN_VALUE;
        }
        Node temp = this.head;
        while (temp.next!=null){
            temp = temp.next;
        }
        int val = temp.data;
        temp = temp.prev;
        if (temp!=null){
            temp.next = null;
        }
        this.size--;
        return val;
    }

    private class Node{
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}
