package com.tnsif.finaldemo;

public class childdemo extends finaldemo {
    // ❌ Cannot override show() because it's final
    void childMethod() {
        System.out.println("child-specific method");
    }
}
