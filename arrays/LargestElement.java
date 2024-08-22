import java.util.*;

public class LargestElement {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
      
        x = sc.nextInt(); // O(1)
        int arr[] = new int[x];
        for (int i = 0; i < x; i++) { // O(n)
            arr[i] = sc.nextInt();
        }
        sc.close(); // Closing the scanner after reading all inputs

        int largest = arr[0];
        for (int i = 0; i < x; i++) { // O(n)
            largest = Math.max(largest, arr[i]);
        }
        System.out.println(largest); // O(1)
    }
}



