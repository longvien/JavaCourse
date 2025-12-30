public class Main {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("Bob", 2);
        System.out.println(p1.name());
        Passenger p2 = new Passenger("Maria", 1);
        if (p1.equals(p2))
            System.out.println("True");
        else
            System.out.println("False");
    }
}