// IMPORT SCANNER CLASS
import java.util.Scanner;

public class Javas1 {
    public static void main(String[] args) {
        // CREATE INSTANCE OF SCANNER CLASS
        Scanner s = new Scanner(System.in);

        // PROMPT USER TO INPUT NUMBER
        System.out.print("Enter a number: ");
        int num = s.nextInt();

        int sum = 0;

        /*
            CREATE WHILE CONDITIONAL STATEMENT
            CALCULATE THE SUM OF THE NUMBER INPUTED BY THE USER
        */ 
        while (num != 0) {
            sum += num % 10;

            num /= 10;
        }

        // OUTPUT FINDINGS
        System.out.println("The sum of the given number is: " + sum);

        s.close();
    }
}