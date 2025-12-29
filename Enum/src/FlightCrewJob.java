public enum FlightCrewJob {
    FLIGHT_ATTENDANT("Flight Attendant"),
    COPILOT("First Officer"),
    PILOT("Captain");

    private String title;
    private FlightCrewJob(String title) {
        this.title = title;
    }
    public String getTitle() {return this.title;}

    void displayJobResponsibility(FlightCrewJob job) {
        switch(job) {
            case FLIGHT_ATTENDANT:
                System.out.println("Assures passengers safety");
                break;
            case PILOT:
                System.out.println("Flies the plane");
                break;

        }
    }
}
