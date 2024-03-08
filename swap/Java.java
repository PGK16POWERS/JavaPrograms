// IMPORT SCANNER CLASS
import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        // CREATE AN INSTANCE OF SCANNER
        Scanner s = new Scanner(System.in);

        // PROMPT USER TO INSERT A NUMBER
        System.out.println("Enter a number");
        int a = s.nextInt();

        System.out.println("Enter a number");
        int b = s.nextInt();

        System.out.println("Original a: " + a);
        System.out.println("Original b: " + b);

        // SWAP THE VALUES
        int temp = a;
        a = b;
        b = temp;

        // OUTPUT THE FINDINGS
        System.out.println("Swapped a: " + a);
        System.out.println("Swapped b: " + b);
        
        s.close();
    }
}