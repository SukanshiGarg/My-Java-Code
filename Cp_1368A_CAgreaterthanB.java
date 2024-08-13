import java.util.*;

public class Cp_1368A_CAgreaterthanB {
    
    // Method to calculate the minimum number of operations
    public static int minOperations(int a, int b, int n) {
        int operations = 0;
        while (a <= n && b <= n) {
            if (a < b) {
                a += b;
            } else {
                b += a;
            }
            operations++;
        }
        return operations;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases

        int T = sc.nextInt();
        int[] results = new int[T];

        // Process each test case
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            results[i] = minOperations(a, b, n);
        }
        
        // Output the results for each test case
        for (int result : results) {
            System.out.println(result);
        }
        
        
        sc.close();
    }
}
