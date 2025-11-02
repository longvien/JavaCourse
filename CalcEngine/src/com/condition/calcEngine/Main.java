package com.condition.calcEngine;

public class Main {

    public static void main(String[] args) {
	    double value1 = 100;
        double value2 = 50;
        double result = 0;
        char opCode = 'f';

        switch(opCode) {
            case 'a':
                result = value1 + value2;
                break;

            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                result = value2 != 0 ? value1 / value2 : 0.0d;
                /* if (value2 != 0) {
                    result = value1 / value2;} also works */
                    break;
            default:
                System.out.println("Invalid OPCode: " + opCode);
                result = 0.0d;
                break;
        }

        System.out.println(result);
    }
}
