package com.method.exit;

public class Main {

    public static void main(String[] args) {
        showSum(3.5f, 1.5f, 0);
        System.out.println("After showSum");
    }

    static void showSum(float x, float y, int count){
        if (count < 1) {
            System.out.println("Count can't be 0");
            return; } // Explicit exit a method with return (In python also return)
        else {
            float sum = x + y;
            for (int counter = 0; counter < count; counter++)
                System.out.println(sum); }

    }
}
