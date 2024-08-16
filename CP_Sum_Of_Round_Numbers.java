import java.util.Scanner;
import java.util.ArrayList;

public class CP_Sum_Of_Round_Numbers{

    // Function to decompose number into round numbers
    public static ArrayList<Integer> decomposeIntoRoundNumbers(int n) {
        ArrayList<Integer> roundNumbers = new ArrayList<>();
        int placeValue = 1;
        
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                roundNumbers.add(digit * placeValue);
            }
            n /= 10;
            placeValue *= 10;
        }
        
        return roundNumbers;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int t = scanner.nextInt();
        
        // Process each test case
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            
            // Decompose the number into round numbers
            ArrayList<Integer> roundNumbers = decomposeIntoRoundNumbers(n);
            
            // Print results
            System.out.println(roundNumbers.size());
            for (int num : roundNumbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
