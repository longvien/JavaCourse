package com.condition.calcEngine;

// import static com.condition.calcEngine.Main.symbolFromOpCode;

public class MathEquation {
    double leftVal;
    double rightVal;
    char opCode;
    private double result;
    private static int numberOfCalculations;
    private static double sumOfResults;


    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public char symbolFromOpCode(){
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
    double getLeftVal(){return this.leftVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    double getRightVal(){ return this.rightVal;}
    public void setOpCode(char opCode) {this.opCode = opCode;}
    char getOpCode(){return this.opCode;}

    public void execute() {
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

/* My Code
    public String toString() {
        return leftVal + " " + symbolFromOpCode(opCode) + " " + rightVal + " = " + result;
    } */

//author: Long Vien