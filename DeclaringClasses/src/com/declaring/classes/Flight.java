package com.declaring.classes;

class Flight {
    int passengers;
     int seats;

    public Flight() {
        passengers = 149;
        seats = 150;
    }
    public void add1passengers() {
        if (passengers < seats)
            passengers += 1;
        else
            handleTooMany();
    }
    private void handleTooMany() {
        System.out.println("Too many");
    }
}
