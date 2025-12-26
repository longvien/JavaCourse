package com.operation;

public class Calculation {
    private final double leftNum;
    private final double rightNum;
    private final char opSymbol;
    private double result;


    Calculation(double leftNum, double rightNum, char opSymbol){
        this.leftNum = leftNum;
        this.rightNum = rightNum;
        this.opSymbol = opSymbol;
    }

    public double calculate(){
        switch(opSymbol){
            case '+':
                result = leftNum + rightNum;
                break;
            case '-':
                result = leftNum - rightNum;
                break;
            case '*':
                result = leftNum * rightNum;
                break;
            case '/':
                result = rightNum != 0.0 ? leftNum / rightNum : 0.0d;
                if (rightNum == 0)
                    System.out.println("Zero Division Error! Default Value: 0!");
                break;
            default:
                result = 0.0;
                System.out.println("Invalid Syntax");
                break;

        }
        return result;
    }
}
