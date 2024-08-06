import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        int x[] = {1, 2, 3, 4, 5};
        int sslargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < x.length; i++) {
            if (x[i] > largest) {
                sslargest = largest;
                largest = x[i];
            } else if (x[i] > sslargest && x[i] != largest) {
                sslargest = x[i];
            }
        }

        if (sslargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element.");
        } else {
            System.out.println("The second largest element is: " + sslargest);
        }
    }
}
