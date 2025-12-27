package com.declaring.classes;

class Flight {
    private int passengers;
    private final int seats = 150;
    private static int allPassengers, maxPassengersPerFlight, totalCheckedBags;

     static {
        AdminService admin = new AdminService();
        maxPassengersPerFlight = admin.isRestricted()?
            admin.getMaxFlightPassenger() : Integer.MAX_VALUE;
    } // Code will run before we use the class

    public Flight() {
    /*  passengers = 0; not necessary because it is set default to 0!
        seats = 150; */
    }

    public static int getAllPassengers() {
         return allPassengers;
    }

    public static int resetAllPassengers() {
        allPassengers = 0;
        return allPassengers;
    }



    private void handleTooMany() {
        System.out.println("Too many");
    }
}
