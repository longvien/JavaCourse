package com.operation;

import static com.operation.OperationName.*;

public class Calculation {
    private double leftNum;
    private double rightNum;
    private OperationName opSymbol;
    private double exponent;
    private double subscript;
    private double result;


    public Calculation(double exponent, double subscript) {
        this.exponent = exponent;
        this.subscript = subscript;
    }

    public Calculation(double leftNum, double rightNum, OperationName opSymbol){
        this.leftNum = leftNum;
        this.rightNum = rightNum;
        this.opSymbol = opSymbol;
    }


    public double calculate(){
        switch(opSymbol){
            case ADD:
                result = leftNum + rightNum;
                break;
            case SUBTRACT:
                result = leftNum - rightNum;
                break;
            case MULTIPLY:
                result = leftNum * rightNum;
                break;
            case DIVIDE:
                result = rightNum != 0.0 ? leftNum / rightNum : 0.0d;
                if (rightNum == 0)
                    System.out.println("Zero Division Error! Default Value: 0!");
                break;
            case EXPONENT:
                result = Math.pow(exponent, subscript);
            default:
                result = 0.0;
                System.out.println("Invalid Syntax");
                break;

        }
        return result;
    }

}
