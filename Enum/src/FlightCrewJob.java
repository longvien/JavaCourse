public enum FlightCrewJob {
    FLIGHT_ATTENDANT,
    COPILOT,
    PILOT;
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
