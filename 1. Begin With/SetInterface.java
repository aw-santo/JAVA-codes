package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {
//        Set<Integer> st = new HashSet<>(); // Hash uses algo which fetches the value which is nearer in memory!
        // Therefore, it'll not maintain the sequence of the set!
        Set<Integer> st = new TreeSet<>(); // fetches in ascending order!
        st.add(21);
        st.add(213);
        st.add(1);
        st.add(11);
        st.add(65);
        for (int i: st) {
            System.out.println(i);
        }
    }
}
