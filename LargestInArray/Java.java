import java.util.Scanner;
import java.util.Arrays;

public class Java {
    public static void main(String[] args) {
        // CREATE AN INSTANCE OF SCANNER CLASS
        Scanner s = new Scanner(System.in);

        // CREATE YOUR ARRAY
        int[] arr = new int[3];

        // CREATE FOR LOOP TO INITIALIZE EACH INDEX
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number:");
            arr[i] = s.nextInt();
        }

        // USE STREAMS FROM ARRAYS TO FIND THE LARGEST NUMBER
        int max = Arrays.stream(arr).max().orElseThrow();

        // OUTPUT LARGEST INT IN THE ARRAY
        System.out.println("The largest number is: " + max);

        s.close();
    }
}