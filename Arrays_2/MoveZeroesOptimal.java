package Arrays_2;

public class MoveZeroesOptimal {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 5, 0, 7, 8};
        int n = arr.length;
        int[] ans = moveZero(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }

    public static int[] moveZero(int arr[], int n) {
        int j = -1;   // Let the initial value be -1 (i.e., no zero found yet)

        // Set the j pointer to the first discovery of 0
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) return arr; // No zeroes in the array

        // Use the two-pointer approach to swap non-zero elements with zeroes
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                // Swap arr[i] (non-zero) with arr[j] (zero)
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                // Move the j pointer to the next zero
                j++;
            }
        }

        return arr;
    }
}
