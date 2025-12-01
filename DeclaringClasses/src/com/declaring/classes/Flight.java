package com.declaring.classes;

class Flight {
    int passengers;
    int seats;

    Flight() {
        passengers = 0;
        seats = 150;
    }
    void add1passengers() {
        do {
            passengers += 1;
            System.out.println(passengers);
        }
        while (passengers < seats);
    }
}
