package com.statements.block;

public class Main {

    public static void main(String[] args) {
	    int v1 = 10, v2 = 4;
        final int diff;
        if (v1 > v2) {
            diff = v1 - v2;
            System.out.println("v1 is larger than v2, diff = " + diff); }
        else {
            diff = v2 - v1;
            System.out.println("v2 is larger than v1, diff = " + diff); }
    }
}
