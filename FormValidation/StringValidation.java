package FormValidation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringValidation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[0-9]+$");

        Boolean isValid = false;
        String name = "";

        while (!isValid) {
            System.out.print("Enter your name: ");
            name = s.nextLine();

            if (pattern.matcher(name).matches()) {
                System.out.println("Enter a valid name...");
            } else {
                isValid = true;
            }
        }

        System.out.println("Username: " + name);
        s.close();;
    }
}