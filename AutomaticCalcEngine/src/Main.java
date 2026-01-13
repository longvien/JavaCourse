import com.operation.Direct;
import com.operation.stepByStep;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("    Welcome to our automatic calculator program!    ");
        System.out.println("====================================================");
        userChoices();
        System.out.println("----------------------------------------------------");
        System.out.println("           Thanks for using our program!            ");
        System.out.println("----------------------------------------------------");
    }

    private static void userChoices() {
        System.out.println("Please choose an operation mode, direct input(d) or step_by_step input(s)?");
        Scanner input = new Scanner(System.in);
        String userChoice = input.nextLine();
        if (userChoice.equals("d"))
            Direct.direct();
        else if (userChoice.equals("s"))
            stepByStep.StepByStep();
        else
            System.out.println("Invalid Syntax! Try Again!");
    }
}