package com.operation;

public class Calculation {
    private double leftNum;
    private double rightNum;
    private final OperationName opSymbol;
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
                result = Math.pow(base, exponent);
                break;
            case SQUAREROOT:
                result = Math.pow(radicand, 1.0 / index);
                break;
            default:
                result = 0.0;
                System.out.println("Invalid Syntax");
                break;

        }
        return result;
    }

}
