package com.method.returnValue.array;

public class Array {
    public static double [] produceInterestHistory(double amt, double rate, int years) {
        double [] accumulateInterest = new double [years];
        for(int yearIndex = 0; yearIndex < years; yearIndex++) {
            int year = yearIndex + 1;
            accumulateInterest[yearIndex] = com.method.returnValue.singleValue.singleValue.calculateInterest(amt, rate, year);
        }
        return accumulateInterest;
    }
}
