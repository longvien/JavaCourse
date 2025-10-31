package com.condition.calcEngine;

public class Main {

    public static void main(String[] args) {
	    double value1 = 100;
        double value2 = 50;
        double result = 0;
        char opCode = 'd';

        if (opCode == 'a')
            result = value1 + value2;
        else if (opCode == 's')
            result = value1 - value2;
        else if (opCode == 'm')
            result = value1 * value2;
        else if (opCode == 'd')
            result = value1 / value2;
        else
            result = 0.0d;

        System.out.println(result);
    }
}
