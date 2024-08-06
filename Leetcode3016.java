import java.util.Arrays;

public class Leetcode3016 {

    public int minPushes(String word) {
        // Frequency of each character in the string
        int arr[] = new int[26];
        for (char ch : word.toCharArray()) {
            arr[ch - 'a']++;
        }

        // Sort the array in increasing order
        Arrays.sort(arr);

        int count = 0;
        int minPushkey = 0;

        // Calculate minPushkey in decreasing order of frequency
        for (int i = 25; i >= 0; i--) {
            int mul = 0;
            if (count < 8) {
                mul = 1;
            } else if (count < 16) {
                mul = 2;
            } else if (count < 24) {
                mul = 3;
            } else {
                mul = 4;
            }
            int val = arr[i] * mul;
            minPushkey += val;
            count++;
        }
        return minPushkey;
    }

    public static void main(String[] args) {
        Leetcode3016 obj = new Leetcode3016();
        String word = "exampleword";
        int result = obj.minPushes(word);
        System.out.println("Min pushes required: " + result);
    }
}
