import com.method.returnValue.singleValue.singleValue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Return Single Value");
        double result = singleValue.calculateInterest(100d, 0.05d, 10);
        System.out.println(result);

    }
}