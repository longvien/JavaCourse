package contructors;

public class Passengers {
    private int checkedBags;
    private int freeBags;
    //getters and setters elided(chưa ghi rõ chi tiết)
    private double perBagFee; //cost for each bag the passenger brings more than the number of free bags.

    public Passengers() { }
    public Passengers(int freeBags) {
        this(freeBags > 1? 25.0:50.0);
        this.freeBags = freeBags;
    }
    public Passengers(int freeBags, int checkedBags) {
        this(freeBags);
        this.checkedBags = checkedBags;
    }
    private Passengers(double perBagsFee) {
        this.perBagFee = perBagsFee;
    }


}
