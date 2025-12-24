package initialization.flight;

public class Flight {
    private int passengers;
    private int seats = 150;
    private int flightNumber;
    private char flightClass;
    private boolean [] isSeatAvailable = new boolean[seats];

    public Flight() {
        for (int i = 0; i < seats; i++)
            isSeatAvailable[i] = true;
    }

    public Flight(int flightNumber) {
        this();
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this();
        this.flightClass = flightClass;
    }




}
