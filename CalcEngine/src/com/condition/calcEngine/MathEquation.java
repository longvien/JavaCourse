package com.condition.calcEngine;

public class MathEquation {
    double leftVal;
    double rightVal;
    char opCode;
    double result;
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
    void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }
    void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }
    void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    void execute() {
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

    public static double getAverageResult() {
        return sumOfResults / numberOfCalculations;
    }
}

