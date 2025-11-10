package com.condition.calcEngine;

public class Main {

    public static void main(String[] args) {
	    double [] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d }; // Values that we're going to use on the left side of the equation
        double [] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d }; // Same like left, this time right.
        char [] opCode = {'d', 'a', 's', 'm'};
        double [] result = new double[opCode.length];

        for (int counter = 0; counter < opCode.length; counter++) {
            result[counter] = execute(opCode[counter], leftVals[counter], rightVals[counter]);
            System.out.println(result);
        }
        for ( double results : result)
            System.out.println(results);
    }
    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal; /* once we do the calculation, we want to
                                                                                 place the result into our results array at that
                                                                                 same index. "result[counter]" */
                break;

            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid OPCode: " + opCode);
                result = 0.0d;
                break;
        }
    return result;
    }
}
