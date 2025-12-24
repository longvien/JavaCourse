package com.declaring.classes;
import static com.declaring.classes.Flight. *;

public class Main {
    public static void main(String[] args) {
        /* Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        flight2.add1Passengers();
        System.out.println(flight2.passengers);
        flight2 = flight1;
        System.out.println(flight2.passengers);
        flight1.add1Passengers();
        flight1.add1Passengers();
        System.out.println(flight2.passengers); */
        resetAllPassengers();
        Flight laxToSlc = new Flight();
        laxToSlc.add1Passengers();
        laxToSlc.add1Passengers();
        Flight dwfToNyc = new Flight();
        dwfToNyc.add1Passengers();
        System.out.print(getAllPassengers());

    }
}
