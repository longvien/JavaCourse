package com.declaring.classes;

class Flight {
    private int passengers;
    private final int seats = 150;
    private static int allPassengers, maxPassengersPerFlight;

    /* static {
        AdminService admin = new AdminService();
        admin.connect();
        maxPassengersPerFlight = admin.isRestricted()?
            admin.getMaxFlightPassenger() : Integer.MAX_VALUE;
        admin.close();
    } Code will run before we use the class  */
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
        if (hasSeating()) {
            passengers += 1;
            allPassengers += 1; }
    }
    private boolean hasSeating() {
        return passengers < seats && passengers < maxPassengersPerFlight;
    }

    private void handleTooMany() {
        System.out.println("Too many");
    }
}
