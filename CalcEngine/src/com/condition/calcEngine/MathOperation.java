package com.condition.calcEngine;

public enum MathOperation {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private char symbol;
    private MathOperation(char symbol){ this.symbol = symbol; }
    public char getSymbol(){ return this.symbol; }
}
//author: Long Vien