public class Main {
    public static void main(String[] args) {
        FlightCrewJob job1 = FlightCrewJob.PILOT;
        FlightCrewJob job2 = FlightCrewJob.FLIGHT_ATTENDANT;
        if (job1 == FlightCrewJob.PILOT)
            System.out.println("job1 is PILOT");
        if (job1 != job2)
            System.out.println("job1 != job2");
        CrewMember tim = new CrewMember(FlightCrewJob.PILOT, "Tim");
        CrewMember christian = new CrewMember(FlightCrewJob.FLIGHT_ATTENDANT, "christian");
        whoIsInCharge(tim, christian);
    }

    static void whoIsInCharge(CrewMember member1, CrewMember member2) {
        CrewMember theBoss = member1.getJob().compareTo(member2.getJob()) > 0 ? member1 : member2;
        System.out.println(theBoss); // override toString()
        // System.out.println(theBoss.getName() + " is the Boss"); use  getName() method.
    }
}