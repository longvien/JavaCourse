package com.method.string;

public class stringEquality {
    public static void main(){
        String s1 = "I love";
        s1 += " Java";
        String s2 = "I ";
        s2 += "love Java";

        if (s1 == s2)
            System.out.println("is1 = is2"); // This won't run (different instances although same value)
        else if (s1.equals(s2))
            System.out.println("s1 = s2"); // This will run. equals() compare value
    }
}
