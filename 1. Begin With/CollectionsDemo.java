package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>{
    int roll, marks;
    String name;

    public Stud(int roll, String name, int marks) {
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stud{" +"roll=" + roll +", marks=" + marks +", name='" + name + '\'' + '}';
    }

    @Override
    public int compareTo(Stud s) {
        return name.length() > s.name.length() ? 1 : -1;
    }
}

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Stud> studs = new ArrayList<>();
        studs.add(new Stud(23, "Mahesh", 55));
        studs.add(new Stud(24, "Sony", 64));
        studs.add(new Stud(25, "Larry", 25));
        studs.add(new Stud(26, "Joseph", 36));

        Collections.sort(studs, (i, j)->i.marks>j.marks?1:-1);
        for (Stud s: studs){
            System.out.println(s);
        }
    }
}
