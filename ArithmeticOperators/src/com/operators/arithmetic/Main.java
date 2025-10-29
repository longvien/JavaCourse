package com.operators.arithmetic;

public class Main {

    public static void main(String[] args) {
        /* int a = 1;
           int b = 1;
           b = ++a;
           System.out.println(b++);
           System.out.println(b); */

        int myOtherValue = 100;
        int val1 = 5;
        int val2 = 10;
        myOtherValue /= val1 * val2;
        System.out.println(myOtherValue);
    }
}
