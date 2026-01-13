package com.operation;

import static com.operation.OperationName.*;

public class Calculation {
    private double leftNum;
    private double rightNum;
    private static OperationName opSymbol;
    private double exponent;
    private double base;
    private int index;
    private double radicand;
    private double result;

    public Calculation(OperationName opSymbol) { this.opSymbol = opSymbol;}
    public Calculation(OperationName opSymbol, double base, double exponent) {
        this(opSymbol);
        this.exponent = exponent;  // base mũ exponent
        this.base = base;
    }
    public Calculation(OperationName opSymbol, int index, double radicand) {
        this(opSymbol);
        this.index = index; // căn bậc index của radicand
        this.radicand = radicand;
    }
    public Calculation(double leftNum, double rightNum, OperationName opSymbol){
        this(opSymbol);
        this.leftNum = leftNum;
        this.rightNum = rightNum;
    }

    public void calculate(){
        switch(opSymbol){
            case ADD:
                result = leftNum + rightNum;
                System.out.println(result);
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
                result = Math.pow(base, exponent);
                break;
            case ROOT:
                result = Math.pow(radicand, 1.0 / index);
                break;
            default:
                result = 0.0;
                System.out.println("Invalid Syntax");
                break;

        }
    }

    @SuppressWarnings("toString")
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder(40);
        switch(opSymbol) {
            case ADD, SUBTRACT, MULTIPLY, DIVIDE:
                builder.append("The result of ");
                builder.append(leftNum);
                builder.append(" ");
                builder.append(opSymbol.getSymbol());
                builder.append(" ");
                builder.append(rightNum);
                builder.append(" = ");
                builder.append(result);
                break;
            case EXPONENT:
                builder.append(base);
                builder.append(" to the power of ");
                builder.append(exponent);
                builder.append(" is ");
                builder.append(result);
                break;
            case ROOT:
                builder.append(index);
                builder.append(ordering(index));
                builder.append(" root of ");
                builder.append(radicand);
                builder.append(" is ");
                builder.append(result);
                break;
            default:
                builder.append("Operation Symbol Invalid!");
                break;
        }
        return builder.toString();
    }

    protected static String ordering(int num1) {
        String num = String.valueOf(num1);
        String digit = String.valueOf(num.charAt(num.length() - 1));
        String order = null;
        if (num1 < 10 || num1 > 20 ) {
            if (digit.equals("1"))
                order = "st";
            else if (digit.equals("2"))
                order = "nd";
            else if (digit.equals("3"))
                order = "rd"; }
        else
            if (digit.equals("1") || digit.equals("2") || digit.equals("3"))
                order = "th";
    return order;
    }

    public static OperationName toOpName(String symbol) {
        String[] opSymbol = {"+", "-", "*", "/", "^", "√"};
        OperationName[] opNames = {ADD, SUBTRACT, MULTIPLY, DIVIDE, EXPONENT, ROOT};
        OperationName value = null;
        for (int i = 0; i < opSymbol.length; i++) {
            if(symbol.equals(opSymbol[i])) {
                value = opNames[i];
            }
        }
        return value;
    }

}
