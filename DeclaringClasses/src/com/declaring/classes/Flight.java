package com.declaring.classes;

class Flight {
    private int passengers;
    private final int seats = 150;
    private static int allPassengers;

    public Flight() {
/*      passengers = 0; not necessary because it is set default to 0!
        seats = 150; */
    }

    public static int getAllPassengers() {
        return allPassengers;
    }

    public static int resetAllPassengers() {
        allPassengers = 0;
        return allPassengers;
    }

    public void add1Passengers() {
        if (passengers < seats) {
            passengers += 1;
            allPassengers += 1; }
        else
            handleTooMany();
    }
    private void handleTooMany() {
        System.out.println("Too many");
    }
}
