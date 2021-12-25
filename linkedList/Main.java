package com.san.linkedList;

public class Main {
    public static void main(String[] args) {
//        DLL d_list = new DLL();
//        d_list.insertAtHead(45);
//        d_list.insertAtHead(123);
//        d_list.insertAtHead(6);
//        d_list.insertAtHead(2);
//        d_list.display();
////        d_list.insertAtTail(999);
//        d_list.insertAfter(666, 6);
////        d_list.displayRev();
//        System.out.println(d_list.getSize());
//        System.out.println(d_list.deleteAtHead());
//        System.out.println(d_list.deleteAtTail());
//        System.out.println(d_list.getSize());
//        d_list.display();

        CLL cll = new CLL();
        cll.insert(23);
        cll.insert(21358);
        cll.insert(968);
        cll.insert(45);
        cll.insert(142);
        cll.display();
//        cll.delete(1000);
        cll.display();
    }
}
