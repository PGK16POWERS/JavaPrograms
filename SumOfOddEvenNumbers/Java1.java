// IMPORT SCANNER CLASS
import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
        // CREATE INSTANCE OF SCANNER
        Scanner s = new Scanner(System.in);

        // PROMPT USER TO INITIALIZE ARRAY
        System.out.print("Initialize array : ");
        int initArr = s.nextInt();
        int[] arr = new int[initArr];

        // CREATE FOR LOOP TO INITIALIZE EACH INDEX
        for (int i = 0 ; i < arr.length; i++) {
            System.out.print("Initialize index " + i + ": ");
            int initInd = s.nextInt();
            arr[i] += initInd;
        }

        int sumOfEven = 0;
        int sumOfOdd = 0;

        // ITERATE THROUGH EACH INDEX OF THE ARRAY
        for ( int arra : arr) {
            if (arra % 2 == 0) {
                sumOfEven += arra;
            } else if (arra % 2 != 0) {
                sumOfOdd += arra;
            }
        }

        // OUT PUT FINDINGS
        System.out.println("The sum of Even numbers is: " + sumOfEven);
        System.out.println("The sum of Odd numbers is: " + sumOfOdd);


        s.close();
    }
}