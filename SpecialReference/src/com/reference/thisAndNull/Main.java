package com.reference.thisAndNull;

public class Main {
    public static void main(String[] args) {
        thisAndNull flight1 = new thisAndNull();
        thisAndNull flight2 = new thisAndNull();
        thisAndNull flight3 = null;

        if (flight1.hasRoom(flight2))
            flight3 = flight1.createNewWithBoth(flight2);
        if (flight3 != null)
            System.out.println("Flight combined");
    }
}