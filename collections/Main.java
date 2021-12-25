package com.san.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(45);
        list.add(5);
        list.add(1);
        list.add(78);
//        System.out.println(list);
        Vector<Integer> vc = new Vector<>();
        vc.add(45);
        vc.add(1);
        vc.add(5);
        vc.add(78);
    }
}
