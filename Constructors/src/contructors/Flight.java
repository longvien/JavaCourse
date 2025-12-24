package contructors;

class Flight {
    private int passengers;
    private int seats = 150;

    public Flight() {
/*      passengers = 0; not necessary because it is set default to 0!
        seats = 150; also not because we can directly set the seats' variable value to 150  */
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
