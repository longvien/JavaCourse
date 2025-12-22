package com.reference.thisAndNull;

public class thisAndNull {
    private int passengers;
    private int seats;

    public boolean hasRoom(thisAndNull f2) {
        int total = this.passengers + f2.passengers;
        return total <= seats;
    }

    public thisAndNull createNewWithBoth(thisAndNull f2) {
        thisAndNull flight = new thisAndNull();
        flight.passengers = this.passengers + f2.passengers;
        return flight;
    }
}
