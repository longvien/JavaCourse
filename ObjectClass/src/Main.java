import java.lang.Object;
public class Main {
    public static void main(String[] args) {
        Object[] array = new Object[5];
        array[0] = 5;
        array[1] = new String("Hello");
        array[2] = "Hello World";
        array[3] = 3.0d;
        array[4] = 4.5f;
        System.out.println(array[4].getClass());
        for (Object i : array)
            System.out.println(i);
    }
}