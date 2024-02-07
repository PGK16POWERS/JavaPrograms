import java.util.Scanner;

public class Poea6 {
    public static void main(String[] args) {

        // CREATE AN INSTANCE OF THE SCANNER CLASS
        Scanner s = new Scanner(System.in);

        // PROMPT THE USER TO INITIALIZE THE LENGTH OF AN ARRAY
        System.out.println("Initialize the length of the array");
        int len = s.nextInt();

        // CREATE AND INITIALIZE THE LENGTH OF THE ARRAY WITH THE VALUE GIVEN BY THE USER
        int[] array = new int[len];

        // LOOP THROUGH EACH INDEX AND INITIALIZE IT WITH A VALUE
        for (int i = 0; i < array.length; i++) {
            // PROMPT THE USER TO INITIALIZE EACH INDEX WITH A VALUE
            System.out.println("Initialize index");
            array[i] = s.nextInt();
        }

        // OUTPUT ALL THE EVEN NUMBERS
        System.out.println("Even numbers are: ");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        // OUTPUT ALL THE ODD NUMBERS
        System.out.println("\nOdd numbers are: ");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
