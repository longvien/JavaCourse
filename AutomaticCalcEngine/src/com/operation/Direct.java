package com.operation;

import java.util.Scanner;
import static com.operation.Calculation.toOpName;
import static com.operation.OperationName.*;

public class Direct {
    public static void direct() {
        String[] parts = choice();
        double leftNum = Double.parseDouble(parts[0]);
        double rightNum = Double.parseDouble(parts[2]);
        OperationName opSymbol = toOpName(parts[1]);
        int leftNum1 = (int) leftNum;

        Calculation user;
        switch(opSymbol){
            case ADD, SUBTRACT, MULTIPLY, DIVIDE:
                user = new Calculation(leftNum, rightNum, opSymbol);
                user.calculate();
                break;
            case EXPONENT:
                user = new Calculation(opSymbol, leftNum, rightNum);
                user.calculate();
                break;
            case ROOT:
                user = new Calculation(opSymbol, leftNum1, rightNum);
                user.calculate();
                break;
            default:
                user = new Calculation(0, 0, ADD);
                user.calculate();
                break;
        }
        System.out.println(user);
    }

    protected static String[] choice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to do basic calculation (n), √ or ^");
        String oslrv1 = input.nextLine().trim();
        String[] parts;
        switch (oslrv1) {
            case "√":
                System.out.println("Please enter the index, root and radicand!");
                String root = input.nextLine().trim();
                parts = root.split(" ");
                break;
            case "^":
                System.out.println("Please enter the base, exponent  and symbol ^ Ex: 5 ^ 2 (space between)");
                String power = input.nextLine().trim();
                parts = power.split(" ");
                break;
            case "n":
                System.out.println("Please enter the operation symbol, left and right numbers. Ex: 5 + 2");
                String calculation = input.nextLine();
                parts = calculation.split(" ");
                break;
            default:
                parts = new String[]{"0", "+", "0" };
                break;
        }
        return parts;
    }
}
