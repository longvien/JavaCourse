import com.method.Method;
import com.parameter.Parameters;

public class Main {

    public static void main(String[] args) {
        System.out.println("Function with Parameters");
        Parameters.returnSum(7.5f, 1.4f, 3);
        System.out.println("Function Basic, without Parameters");
        Method.output();
        /* Method method = new Method();
        method.output(); */
    }
}

