public class Ava4 {
    public static void main(String[] args) {

        int[] scores = {45, 87,100,34,7623,3764,23,2387,23,45,56,67,2,78,45,23,12};

        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        double average = (double) sum / scores.length;

        System.out.println("The average is: " + average);
    }
}
