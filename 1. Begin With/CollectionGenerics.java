package com.company;

import java.util.*;


public class CollectionGenerics {
    public static void main(String[] args) {
//        Collection values = new ArrayList();
//        values.add(4);
//        values.add(6.5);
//        values.add("san");
//
////        System.out.println(values);
//        Iterator it = values.iterator();
//
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        //list without a particular dtype
//        List li = new ArrayList();
//        li.add(4);
//        li.add('c');
//        li.add(4.2356);
//        li.add(2, "san");

//        for (int i=0; i<li.size(); i++) {
//            System.out.println(li.get(i));
//        }

//        for (Object o: li){
//            System.out.println(o);
//        }

        // list of particular type
        List<Integer> li = new ArrayList<>();
        li.add(78);  // Integer i = new Integer(78);
        li.add(456);
        li.add(1);
        li.add(4);
//        Collections.sort(li);

//        Comparator<Integer> c = (i, j) -> ((i % 10) > (j % 10)) ? 1 : -1;

        Collections.sort(li, ((i, j) -> ((i % 10) > (j % 10)) ? 1 : -1));
//        Collections.reverse(li);
//        System.out.println(Collections.max(li));
        for (Integer i: li){
            System.out.println(i);
        }
    }

}
