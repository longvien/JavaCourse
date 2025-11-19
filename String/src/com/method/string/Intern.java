package com.method.string;

public class Intern {
    public static void main() {
        String s1 = "I love";
        s1 += " Java";
        String s2 = "I";
        s2 += " love Java";

        s1 = s1.intern();
        s2 = s2.intern();

        if (s1 == s2)
            System.out.println("Equals!");
    }
}
