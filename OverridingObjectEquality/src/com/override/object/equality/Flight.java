package com.override.object.equality;

public class Flight {
    private int flightNumber;

    Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    public boolean equals(Object o) {
    if (! ( o instanceof Flight))
        return false;
    else {
        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber;}
    }
}


/* my Code

    int getFlightNumber(){
        return this.flightNumber;
    }

    public boolean equals(Flight f2) {
        if (this.flightNumber != f2.getFlightNumber())
            return false;
        else
            return true;
    } */
