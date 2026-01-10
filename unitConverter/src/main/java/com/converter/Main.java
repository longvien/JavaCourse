package com.converter;
import com.converter.core.LengthConverter;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        lengthConverter();
    }

    public static void lengthConverter() {
        Scanner user1 = new Scanner(System.in);
        System.out.println("Please enter the input unit");
        String userChoice1 = user1.nextLine().trim();
        System.out.println("Please enter the output unit");
        String userChoice2 = user1.nextLine().trim();
        System.out.println("Please enter the input Value");
        double inputValue = Double.parseDouble(user1.nextLine().trim());
        LengthConverter user = getLengthConverter(userChoice1, userChoice2, inputValue);
        System.out.println(inputValue + userChoice1 + " to " + userChoice2 + " is " + user.convert() + userChoice2);
    }

    public static LengthConverter getLengthConverter(String userChoice1, String userChoice2, double inputValue) {
        String[] unitLength = {"km", "hm", "dam", "m", "dm", "cm", "mm"};
        int userChoice1Index = 0;
        int userChoice2Index = 0;
        for (int i = unitLength.length - 1; i >= 0; i--) {
            if (unitLength[i].equals(userChoice1)) {
                userChoice1Index = i;
            }
            if (unitLength[i].equals(userChoice2)) {
                userChoice2Index = i;
            }
        }
        LengthConverter user = new LengthConverter(userChoice1Index, userChoice2Index, userChoice1, userChoice2, inputValue);
        return user;
    }
}