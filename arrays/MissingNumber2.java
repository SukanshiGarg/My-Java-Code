
// time complexity : only a single loop O(N) 
import java.util.Scanner;

public class MissingNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();  // Total numbers including the missing number
        int arr[] = new int[n-1];
        int sum = 0;
        int summation = n * (n + 1) / 2;

        System.out.println("Enter " + (n-1) + " numbers:");
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // missing number = summation - sum
        int ans = summation - sum;
        System.out.println("The missing number is: " + ans);
    }
}

