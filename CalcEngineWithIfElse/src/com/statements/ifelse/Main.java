package com.statements.ifelse;
public class Main {

    public static void main(String[] args) {
        double value1 = 100;
        double value2 = 50;
        double result = 0;
        char opCode = 'a';

        if (opCode == 'a')
            result = value1 + value2;
        else if (opCode == 's')
            result = value1 - value2;
        else if (opCode == 'm')
            result = value1 * value2;
        else if (opCode == 'd') {
            if (value2 != 0)
                result = value1 / value2; }
            /*  { if (value2 == 0)
                     System.out.println("Zero Division Error");
                 else
                     System.out.println(result);}  my idea */
        else {
            System.out.println("Invalid OPCode: " + opCode);
            result = 0.0d; }

        System.out.println(result);
    }
}
