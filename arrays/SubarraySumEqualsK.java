import java.util.HashMap;

public class SubarraySumEqualsK {
    // Method to find the count of subarrays that sum to k
    public static int findKSumSubarray(int[] arr, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> sumFreqMap = new HashMap<>();
        sumFreqMap.put(0, 1);  // To handle the case when the subarray starts from index 0

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum - k;

            // If rem is found in the map, add its frequency to the count
            count += sumFreqMap.getOrDefault(rem, 0);

            // Add the current sum to the map, or update its frequency
            sumFreqMap.put(sum, sumFreqMap.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    // Main method for testing the implementation
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5};
        int k = 5;
        int result = findKSumSubarray(arr, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}
