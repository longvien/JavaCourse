public class CrewMember {
    FlightCrewJob job;
    String name;

    public CrewMember(FlightCrewJob job, String name) {
        this.job = job;
        this.name = name;
    }
    public FlightCrewJob getJob() {return this.job;}
    public String getName( ) {return this.name;}

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(20);
        builder.append(getJob().getTitle());
        builder.append(" ");
        builder.append(this.name);
        builder.append(" is the boss");
        return builder.toString();
    }
}
