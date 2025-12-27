package contructors;

class Flight {
    private int passengers;
    private int seats = 150;
    private static int allPassengers, maxPassengersPerFlight, totalCheckedBags;

    public void add1Passengers() {
    if (hasSeating()) {
        passengers += 1;
        allPassengers += 1; } }


    public void add1Passengers(int bags) {
        if (hasSeating()) {
            add1Passengers();
            totalCheckedBags += bags;
        }
    }

    public void add1Passengers(Passengers p) {
        add1Passengers(p.getCheckedBags());
    }

    public void add1Passengers(int bags, int carryOns) {
        if (carryOns <= 2)
            add1Passengers(bags);
    }

    public void add1Passengers(Passengers p, int carryOns) {
        add1Passengers(p.getCheckedBags(), carryOns);
    }


    private boolean hasSeating() {
        return passengers < seats;
    }

    /*   public Flight() {
      passengers = 0; not necessary because it is set default to 0!
        seats = 150; also not because we can directly set the seats' variable value to 150
    }*/
}
