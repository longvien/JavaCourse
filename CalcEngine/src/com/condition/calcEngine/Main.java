package com.condition.calcEngine;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    double [] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d }; // Values that we're going to use on the left side of the equation
        double [] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d }; // Same like left, this time right.
        char [] opCode = {'d', 'a', 's', 'm'};
        double [] result = new double[opCode.length];

        executeInteractively();

        if(args.length == 0 ) {
            for (int counter = 0; counter < opCode.length; counter++)
                result[counter] = execute(opCode[counter], leftVals[counter], rightVals[counter]);
            for ( double currentResults : result)
                System.out.println(currentResults);
        }
        else if (args.length == 1 && args[0].equals("interactive")) {
            executeInteractively();
        }
        else if (args.length == 3) {
            handleCommandLine(args);
        }
        else
            System.out.println("Pls provide an operation code and two numeric numbers ");
    }
    static void executeInteractively() {
        System.out.println("Enter an operation and two numbers\n");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String [] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        double result = execute(opCode, leftVal, rightVal);
        displayResult(opCode, leftVal, rightVal, result);
    }

    private static void displayResult(char opCode, double leftVal, double rightVal, double result) {
        char symbol = symbolFromOpCode(opCode);
        StringBuilder builder = new StringBuilder(20);
        builder.append(leftVal);
        builder.append(" ");
        builder.append(symbol);
        builder.append(" ");
        builder.append(rightVal);
        builder.append(" = ");
        builder.append(result);
        String output = builder.toString();
        System.out.println(output);
    }

    private static char symbolFromOpCode(char opCode) {
        char [] opCodes = {'a', 's', 'm', 'd'};
        char [] symbols = {'+', '-', '*', '/'};
        char symbol = ' ';
        for (int index = 0; index < opCodes.length; index++) {
            if (opCode == opCodes[index]) {
                symbol = symbols[index];
                break;
            }
        }
        return symbol;
    }
    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }

    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
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

    static char opCodeFromString(String operationName) {
        char opCode = operationName.charAt(0);
        return opCode;
    }

    static double valueFromWord(String word) {
        String [] numberWords = { "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine", "ten" };
        double value = 0;
        for (int index = 0; index < numberWords.length; index++) {
            if (word.equals(numberWords[index])) {
                value = index;
                break;
            }
        }
        return value;
    }
}
