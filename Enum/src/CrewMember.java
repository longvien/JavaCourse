public class CrewMember {
    FlightCrewJob job;
    String name;

    public CrewMember(FlightCrewJob job, String name) {
        this.job = job;
        this.name = name;
    }

    public FlightCrewJob getJob() {
        return this.job;
    }
    public String getName( ) {
        return this.name;
    }
    public String toString(CrewMember o) {
        StringBuilder builder = new StringBuilder(20);
        builder.append(this.job);
        return builder.toString();
    }
}
