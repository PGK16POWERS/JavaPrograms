package RandomNumberGen;

import java.util.Random;

public class Random {
    public static void main(String[] args) {
        // CREATE INSTANCE OF RANDOM CLASS
        Random random = new Random();

        // CREATE RANDOM DIGIT
        long randomNumber = (long) (random.nextDouble() * 9_000_000_000l) + 1_000_000_000l;

        // OUTPUT FINDINGS
        System.out.println("Result: " + randomNumber);
    }
}