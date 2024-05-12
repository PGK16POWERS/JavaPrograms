package JavaCalculator;

import java.util.Scanner;

public class JavaCalc {

    public static int calc, num1, num2;

    // CREATE METHOD FOR EACH OPERATOR
    int add (int a, int b) {
        calc = a + b;
        return calc;
    };

    int subtract (int a, int b) {
        calc = a - b;
        return calc;
    };

    int multiply (int a, int b) {
        calc = a * b;
        return calc;
    };

    int divide (int a, int b) {
        calc = a / b;
        return calc;
    };

    public static void main(String[] args) {
        // CREATE AN INSTANCE OF SCANNER AND MAIN CLASS
        JavaCalc obj = new JavaCalc();
        Scanner s = new Scanner(System.in);

        // PROMPT THE USER FOR NUMBER VALUES AND TO CHOOSE AN OPERATOR
        System.out.print("Enter a number: ");
        num1 = s.nextInt();

        System.out.print("Choose operator [- + * /]: ");
        String operator = s.next();

        System.out.print("Enter a number");
        num2 = s.nextInt();

        // CREATE SWITCH STATEMENT TO HANDLE EACH OPERATOR
        switch (operator) {
            case "+" :
                calc = obj.add(num1, num2);
                System.out.println("\nAnswer = " + calc);
                break;
            
            case "-" :
                calc = obj.subtract(num1, num2);
                System.out.println("\nAnswer = " + calc);
                break;

            case "*" :
                calc = obj.multiply(num1, num2);
                System.out.println("\nAnswer = " + calc);
                break;

            case "/" :
                calc = obj.divide(num1, num2);
                System.out.println("\nAnswer = " + calc);
                break;

            default :
                System.out.println("Error while Calculating, please try again.");
        }

        s.close();
    }
}