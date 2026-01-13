package com.operation;
import java.util.Scanner;

import static com.operation.Calculation.toOpName;
import static com.operation.OperationName.*;

public class stepByStep {
    @SuppressWarnings("switch")
    public static void StepByStep() {
        System.out.println("Please enter the operation symbol! add(+), subtract(-), multiply(*), divide(/), exponent(^) or root(√) !");
        Scanner input = new Scanner(System.in);
        String opSymbol1 = input.nextLine();
        OperationName opSymbol = toOpName(opSymbol1);
        Calculation user;
        switch(opSymbol) {
            case ADD, SUBTRACT, MULTIPLY, DIVIDE:
                System.out.println("Please enter the left number!");
                double leftNum = Double.parseDouble(input.nextLine());
                System.out.println("Please enter the right number!");
                double rightNum = Double.parseDouble(input.nextLine());
                user = new Calculation(leftNum, rightNum, opSymbol);
                user.calculate();
                break;
            case EXPONENT:
                System.out.println("Please enter the base!");
                double base = Double.parseDouble(input.nextLine());
                System.out.println("Please enter the exponent!");
                double exponent = Double.parseDouble(input.nextLine());
                user = new Calculation(opSymbol, base, exponent);
                user.calculate();
                break;
            case ROOT:
                System.out.println("Please enter the radicand!");
                double radicand = Double.parseDouble(input.nextLine());
                System.out.println("Please enter the index!");
                int index = Integer.parseInt(input.nextLine());
                user = new Calculation(opSymbol, index, radicand);
                user.calculate();
                break;
            default:
                user = new Calculation(0, 0, ADD);
                user.calculate();
                break;
        }
        System.out.println(user);
    }
}

