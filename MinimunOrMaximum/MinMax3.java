import java.util.Arrays;

public class MinMax3 {
    public static void main(String[] args) {
        // CREATE YOUR ARRAY
        int[] scores = {76, 23, 12, 2, 45, -79, 100};

        // CONVERT THE ARRAY INTO STREAMS
        int min = Arrays.stream(scores).min().orElseThrow();
        int max = Arrays.stream(scores).max().orElseThrow();

        // OUTPUT YOURS FINDINGS
        System.out.println("Smallest int is: " + min);
        System.out.println("Largest int is: " + max);
        System.out.println(min + max);
    }
}
