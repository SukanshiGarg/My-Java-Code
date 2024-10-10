import java.util.*;

public class GameWithIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Read the number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Read the integer n for the test case
            // Determine the winner
            if (n % 3 == 0) {
                System.out.println("Second"); // Vova wins
            } else {
                System.out.println("First"); // Vanya wins
            }
        }
        sc.close(); // Close the scanner
    }
}
