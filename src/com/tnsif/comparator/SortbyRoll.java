package com.tnsif.comparator;

import java.util.Comparator;

public class SortbyRoll implements Comparator<student> {

    @Override
    public int compare(student b1, student b2) {
        return b1.rollno - b2.rollno;  // ascending order
    }
}
