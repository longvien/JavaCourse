import static com.method.returnValue.array.Array.produceInterestHistory;
import static com.method.returnValue.singleValue.singleValue.calculateInterest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Return Single Value");
        double result = calculateInterest(100d, 0.05d, 10);
        System.out.println(result);
        System.out.println("Return an Array");
        double [] result2 = produceInterestHistory(100d, 0.05d, 3);
        System.out.println(result2);
    }
}