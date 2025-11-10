package com.method.returnValue.array;

import static com.method.returnValue.singleValue.singleValue.calculateInterest;

public class Array {
    public static double [] produceInterestHistory(double amt, double rate, int years) {
        double [] accumulateInterest = new double [years];
        for(int yearIndex = 0; yearIndex < years; yearIndex++) {
            int year = yearIndex + 1;
            accumulateInterest[yearIndex] = calculateInterest(amt, rate, year);
        }
        return accumulateInterest;
    }
}
