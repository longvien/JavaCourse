package com.override.object.equality;

public class Main {
    public static void main(String[] args) {
        Flight f1 = new Flight(175);
        Flight f2 = new Flight(175);
        Passenger p = new Passenger();
        if (f1.equals(f2))
            System.out.println("Equals");
        else
            System.out.println("Not Equals");


    }
}