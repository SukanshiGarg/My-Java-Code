
import java.util.Scanner;

public class HalloumiBox {

   public static boolean isSorted(int arr[], int n) {
      for (int i = 1; i < n; i++) {
         if (arr[i] < arr[i - 1]) {
            return false;
         }
      }
      return true;
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         int n = sc.nextInt();
         int k = sc.nextInt(); // Corrected typo here
         int arr[] = new int[n];

         for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
         }

         if (isSorted(arr, n) || k >= 2) {
            System.out.println("YES");
         } else {
            System.out.println("NO");
         }
      }
   }
}
