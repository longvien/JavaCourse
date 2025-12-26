package com.operation;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("    Welcome to our automatic calculator program!    ");
        System.out.println("====================================================");
        userChoices();
        System.out.println("----------------------------------------------------");
        System.out.println("           Thanks for using our program!            ");
        System.out.println("----------------------------------------------------");
    }

    private static void userChoices() {
        System.out.println("Please choose an operation mode, direct input(d) or step_by_step input(s)?");
        Scanner input = new Scanner(System.in);
        String userChoice = input.nextLine();
        if (userChoice.equals("d"))
            direct();
        else if (userChoice.equals("s"))
            stepByStep();
        else
            System.out.println("Invalid Syntax! Try Again!");
    }
    protected static void direct() {
        System.out.println("Please enter the operation symbol, left and right numbers. Ex: 5 + 2");
        Scanner input = new Scanner(System.in);
        String oslrv = input.nextLine();
        String [] parts = oslrv.split(" ");
        double leftNum = Double.parseDouble(parts[0]);
        double rightNum = Double.parseDouble(parts[2]);
        char opSymbol = parts[1].charAt(0);
        Calculation user = new Calculation(leftNum, rightNum, opSymbol);
        double result = user.calculate();
        System.out.println("The result of " + leftNum + " " + opSymbol + " " + rightNum + " = " + result);


    }
    protected static void stepByStep() {
        System.out.println("Please enter the operation symbol! + - * /");
        Scanner input = new Scanner(System.in);
        String opSymbol1 = input.nextLine();
        char opSymbol = opSymbol1.charAt(0);
        System.out.println("Please enter the left number!");
        String leftNum1 = input.nextLine();
        double leftNum = Double.parseDouble(leftNum1);
        System.out.println("Please enter the right number!");
        String rightNum1 = input.nextLine();
        double rightNum = Double.parseDouble(rightNum1);
        Calculation user = new Calculation(leftNum, rightNum, opSymbol);
        double result = user.calculate();
        System.out.println("The result of " + leftNum1 + " " + opSymbol1 + " " + rightNum1 + " = " + result);
    }

}