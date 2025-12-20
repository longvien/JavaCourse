package com.declaring.classes;

public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        flight2.add1passengers();
        System.out.println(flight2.passengers);
        flight2 = flight1;
        System.out.println(flight2.passengers);
        flight1.add1passengers();
        flight1.add1passengers();
        System.out.println(flight2.passengers);
    }
}
