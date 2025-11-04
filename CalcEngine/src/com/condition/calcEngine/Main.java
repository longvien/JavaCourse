package com.condition.calcEngine;

public class Main {

    public static void main(String[] args) {
	    double [] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d }; // Values that we're going to use on the left side of the equation
        double [] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d }; // Same like left, this time right.
        char [] opCode = {'d', 'a', 's', 'm'};
        double [] result = new double[opCode.length];

        for (int counter = 0; counter < opCode.length; counter++) {
            switch (opCode[counter]) {
                case 'a':
                    result[counter] = leftVals[counter] + rightVals[counter]; /* once we do the calculation, we want to
                                                                                 place the result into our results array at that
                                                                                 same index. "result[counter]" */
                    break;

                case 's':
                    result[counter] = leftVals[counter] - rightVals[counter];
                    break;
                case 'm':
                    result[counter] = leftVals[counter] * rightVals[counter];
                    break;
                case 'd':
                    result[counter] = rightVals[counter] != 0.0d ? leftVals[counter] / rightVals[counter] : 0.0d;

                    /* if (rightVals[counter] != 0) {
                        result = leftVals[counter] / rightVals[counter];
                        break; } also works */
                    break;
                default:
                    System.out.println("Invalid OPCode: " + opCode[counter]);
                    result[counter] = 0.0d;
                    break;
            }
        }
        for ( double results : result)
            System.out.println(results);
    }
}
