package com.tnsif.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class demo {
    public static void main(String[] args) {
        ArrayList<student> al = new ArrayList<student>();

        al.add(new student(262, "rashmi", "bangalore"));
        al.add(new student(243, "kusuma", "bangalfdsfore"));
        al.add(new student(278, "sushma", "ban"));

        System.out.println("Sort by Roll:");
        Collections.sort(al, new SortbyRoll());
        for (student s : al) {
            System.out.println(s);
        }

        System.out.println("\nSort by Name:");
        Collections.sort(al, new sortbyname());
        for (student s : al) {
            System.out.println(s);
        }
    }
}
