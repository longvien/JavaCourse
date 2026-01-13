package com.operation;

public enum OperationName {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    EXPONENT("^"),
    ROOT("√");

    private final String symbol;

    OperationName(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }
}
