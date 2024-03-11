// IMPORT SCANNER CLASS
import java.util.Scanner;

public class Javad {
    public static void main(String[] args) {
        // CREATE AN INSTANCE OF THE SCANNER CLASS
        Scanner s = new Scanner(System.in);

        // CREATE INT VARIABLES 
        int dividend, divisor;

        // PROMPT USER TO INITIALIZE EACH VARIABLE RESPECTIVELY
        System.out.println("Enter divisor");
        divisor = s.nextInt();

        System.out.println("Enter dividend");
        dividend = s.nextInt();

        // CREATE IF-ELSE STATEMENT FOR EVALUATIONS BETWEEN DIVIDEND AND DIVISOR
        if ( dividend % divisor == 0) {
            System.out.println(dividend + " is divisible by " + divisor);
            System.out.println(divisor + " goes into " + dividend + ": " + dividend / divisor + " times");
        } else {
            System.out.println(dividend + " is not divisble by " + divisor);
        }

        s.close();
    }
}