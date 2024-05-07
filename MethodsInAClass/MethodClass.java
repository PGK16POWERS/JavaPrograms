package MethodsInAClass;

import java.util.Scanner;

public class MethodClass {
    
    int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        MethodClass obj = new MethodClass();

        Scanner s = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num1 = s.nextInt();

        s.close();
    }

}
