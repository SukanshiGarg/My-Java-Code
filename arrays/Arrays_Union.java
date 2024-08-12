import java.util.*;

public class Arrays_Union {

    public static ArrayList<Integer> insertionArrays(int[] A, int[] B) {
        // Create an integer ArrayList to store the result
        ArrayList<Integer> ans = new ArrayList<>();
        // Pointers for A and B
        int i = 0, j = 0;

        // Traverse both arrays
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                i++;
            } else if (A[i] > B[j]) {
                j++;
            } else {
                // A[i] == B[j]
                if (ans.isEmpty() || !ans.get(ans.size() - 1).equals(A[i])) {
                    ans.add(A[i]);
                }
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Array initialization
        int A[] = {1, 2, 3, 4, 5};
        int B[] = {2, 3, 4, 5};

        ArrayList<Integer> ans = insertionArrays(A, B);

        // Print the result
        for (int integer : ans) {
            System.out.print(integer + " ");
        }
    }
}
