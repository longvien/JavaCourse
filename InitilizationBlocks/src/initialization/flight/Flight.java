package initialization.flight;

public class Flight {
    private int passengers;
    private int seats = 150;
    private int flightNumber;
    private char flightClass;
    private boolean [] isSeatAvailable = new boolean[seats];

    { for (int i = 0; i < seats; i++)
            isSeatAvailable[i] = true; }

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    public Flight(char flightClass) {
        this.flightClass = flightClass;
    }
    protected int getFlightNumber(){
        return this.flightNumber;
    }
    protected int setFlightNumber(int newNum){
        this.flightNumber = newNum;
        return this.flightNumber;
    }
    static void swapFlight(Flight i, Flight j) {
        int k = i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);
    }
}