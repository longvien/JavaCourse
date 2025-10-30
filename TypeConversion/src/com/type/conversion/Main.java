package com.type.conversion;

public class Main {

    public static void main(String[] args) {
	    float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5L;

        short result1 = (short) longVal;
        short result2 = (short) (byteVal - longVal) ;
        /*I want to convert the results of the calculation. So to do that,
        I'll enclose the entire calculation in parentheses.*/
        float result3 = longVal - floatVal;

        System.out.println("Sucess");

        //VarKeyword
        var v1 = 50;
        v1 = (int) 100.0;

        var thisValue = 7.5f;
        v1 = (int) thisValue;

        System.out.println(v1);

    }
}
