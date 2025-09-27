package com.tnsif.finaldemo;

public class finaldemo {
    final static int a = 5;   // cannot be reassigned

    static void display() {
        // a = 10; // ❌ not allowed, because 'a' is final
        System.out.println("Value of a = " + a);
    }

    final void show() { // final → cannot be overridden
        System.out.println("welcome");
    }
}
