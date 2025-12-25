package initialization.flight;
import static initialization.flight.Flight.*;

public class Main {
    public static void main(String[] args) {
        Flight f1 = new Flight(10);
        Flight f2 = new Flight(20);
        swapFlight(f1, f2);
        System.out.println(f1.getFlightNumber());
    }
}