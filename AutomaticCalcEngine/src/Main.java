import com.operation.Calculation;
import com.operation.OperationName;
import static com.operation.OperationName.*;
import static java.util.EnumSet.range;

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
        OperationName opSymbol = toOpName(parts[1]);
        Calculation user = new Calculation(leftNum, rightNum, opSymbol);
        double result = user.calculate();
        System.out.println("The result of " + leftNum + " " + opSymbol + " " + rightNum + " = " + result);


    }

    protected static void stepByStep() {
        System.out.println("Please enter the operation symbol! add(+), subtract(-), multiply(*), divide(/), exponent(^) or root(√) !");
        Scanner input = new Scanner(System.in);
        String opSymbol1 = input.nextLine();
        OperationName opSymbol = toOpName(opSymbol1);

        if (opSymbol1.equals("+") || opSymbol1.equals("-") || opSymbol1.equals("*") || opSymbol1.equals("/")) {
            System.out.println("Please enter the left number!");
            String leftNum1 = input.nextLine();
            double leftNum = Double.parseDouble(leftNum1);
            System.out.println("Please enter the right number!");
            String rightNum1 = input.nextLine();
            double rightNum = Double.parseDouble(rightNum1);
            Calculation user = new Calculation(leftNum, rightNum, opSymbol);
            double result = user.calculate();
            System.out.println("The result of " + leftNum1 + " " + opSymbol1 + " " + rightNum1 + " = " + result); }

        else if (opSymbol1.equals("^")) {
            System.out.println("Please enter the base!");
            String base1 = input.nextLine();
            double base = Double.parseDouble(base1);
            System.out.println("Please enter the exponent!");
            String exponent1 = input.nextLine();
            double exponent = Double.parseDouble(exponent1);
            Calculation user = new Calculation(opSymbol, base, exponent);
            double result = user.calculate();
            System.out.println(base + " to the power of " + exponent + " is " + result); }
        else if (opSymbol1.equals("√")) {
            System.out.println("Please enter the radicand!");
            String radicand1 = input.nextLine();
            double radicand = Double.parseDouble(radicand1);
            System.out.println("Please enter the index!");
            String index1 = input.nextLine();
            int index = Integer.parseInt(index1);
            Calculation user = new Calculation(opSymbol, index, radicand);
            double result = user.calculate();
            System.out.println(index + "th" + " root of " + radicand + " is " + result); }
    }

    protected static OperationName toOpName(String symbol) {
        String[] opSymbol = {"+", "-", "*", "/", "^", "√"};
        OperationName[] opNames = {ADD, SUBTRACT, MULTIPLY, DIVIDE, EXPONENT, SQUAREROOT};
        OperationName value = null;
        for (int i = 0; i < opSymbol.length; i++) {
            if(symbol.equals(opSymbol[i])) {
                value = opNames[i];
            }
        }
    return value;
    }
}