package com.condition.calcEngine;

// import static com.condition.calcEngine.Main.symbolFromOpCode;

import static com.condition.calcEngine.MathOperation.*;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private MathOperation opCode;
    private double result;
    private static int numberOfCalculations;
    private static double sumOfResults;


    public MathEquation(MathOperation opCode) {
        this.opCode = opCode;
    }

    public MathEquation(MathOperation opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public char symbolFromOpCode(){
        MathOperation [] opCodes = {ADD, SUBTRACT, MULTIPLY, DIVIDE};
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

    public String toString(){
        char symbol = symbolFromOpCode();
        StringBuilder builder = new StringBuilder(20);
        builder.append(leftVal);
        builder.append(" ");
        builder.append(symbol);
        builder.append(" ");
        builder.append(rightVal);
        builder.append(" = ");
        builder.append(result);
        return builder.toString();
    }
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public double getLeftVal(){return this.leftVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public double getRightVal(){ return this.rightVal;}
    public void setOpCode(MathOperation opCode) {this.opCode = opCode;}
    public MathOperation getOpCode(){return this.opCode;}

    public void execute() {
        switch (opCode) {
            case ADD:
                result = leftVal + rightVal;
                break;
            case SUBTRACT:
                result = leftVal - rightVal;
                break;
            case MULTIPLY:
                result = leftVal * rightVal;
                break;
            case DIVIDE:
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid OPCode: " + opCode);
                result = 0.0d;
                break;
        }
        numberOfCalculations++;
        sumOfResults += result;
    }

    public void execute(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
    }
    public void execute(int leftVal, int rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
        result = (int) result; // result = Math.round(result);
    }

    public static double getAverageResult() {
        return sumOfResults / numberOfCalculations;
    }

    public double getResult() {
        return this.result;
    }
}

/* My toString() override code.
    public String toString() {
        return leftVal + " " + symbolFromOpCode(opCode) + " " + rightVal + " = " + result;
    } */

//author: Long Vien