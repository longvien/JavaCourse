package com.theory.arrays;

public class Main {

    public static void main(String[] args) {
	    float [] theVals = {10.0f, 20.0f, 15.0f};
        float sum = 0.0f;
        for (int counter = 0; counter < theVals.length; counter++)
            sum += theVals[counter];
        System.out.println(sum);


    }
}
