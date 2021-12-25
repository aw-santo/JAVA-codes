package com.san.linkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertAtHead(int val){
        Node n = new Node(val);
        n.next = this.head;
        this.head = n;

        if (this.tail == null){
            this.tail = this.head;
        }
        this.size++;
    }

    public void insertAtTail(int val){
        if (this.tail == null){
            this.insertAtHead(val);
            return;
        }
        Node n = new Node(val);
        this.tail.next = n;
        this.tail = n;
        this.size++;
    }

    public void print(){
        Node temp = this.head;
        while (temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertAt(int val, int index){
        if (index==0){
            this.insertAtHead(val);
            return;
        }
        if (index == this.size){
            this.insertAtTail(val);
            return;
        }
        if (index > this.size){
            System.out.println("Index out of bound Exceeption!, for insertion of "+ val +" at index "+index);
            return;
        }
        int counter = 1;
        Node temp = this.head;
        while (counter < index && temp != null){
            temp = temp.next;
            counter++;
        }
        Node n = new Node(val, temp.next);
        temp.next = n;
        this.size++;
    }

    public int deleteFirst(){
        if (size<=0){
            return Integer.MIN_VALUE;
        }
        int val = this.head.value;
        this.head = this.head.next;
        if (this.head == null){
            this.tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if (this.size<=1){
            return this.deleteFirst();
        }
        int val = this.tail.value;

        Node sec_last = get(this.size-2);
        sec_last.next = null;
        this.tail = sec_last;

        return val;
    }

    public int deleteAt(int index){
        if (index == 0){
            return this.deleteFirst();
        }
        if (index==size-1){
            return this.deleteLast();
        }
        Node n = get(index-1);
        int val = n.next.value;

        n.next = n.next.next;

        return val;
    }

    public boolean isThere(int val){
        Node n = this.head;
        while (n!=null){
            if (n.value == val){
                return true;
            }
            n = n.next;
        }
        return false;
    }
    private Node get(int index){
        Node n = this.head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n;
    }

    public void removeDuplis(){
        Node n = this.head;
        while (n.next!=null){
            if (n.value == n.next.value) {
                n.next = n.next.next;
                this.size--;
            }
            else {
                n = n.next;
            }
        }
        this.tail = n;
        this.tail.next = null;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args){
        LL list = new LL();
        list.insertAtHead(3);
        list.insertAtHead(3);
        list.insertAtHead(3);
        list.insertAtHead(2);
        list.insertAtHead(1);
        list.insertAtHead(1);
//        list.insertAt(999, 22);
        list.print();
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
//        System.out.println(list.deleteAt(3));
//        list.print();
//        System.out.println(list.isThere(78));
        list.removeDuplis();
        list.print();
    }
}
