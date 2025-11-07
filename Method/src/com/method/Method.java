package com.method;

public class Method {
    public static void output() {
        System.out.println("Before confir");
        confirm();
        System.out.println("After confirm");
    }
    static void confirm() {
        System.out.println("Inside method");
        System.out.println("Still inside");
    }
}
