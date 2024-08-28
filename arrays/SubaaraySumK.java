import java.util.HashMap;
public class SubaaraySumK {

    public int subArraySum(int nums[], int k) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        // Initialize the map with the base case: prefix sum 0 with one occurrence
        prefixSumMap.put(0, 1);

        for (int num : nums) {
            prefixSum += num;

            // Check if there's a prefix sum that when subtracted from current prefix sum equals k
            if (prefixSumMap.containsKey(prefixSum - k)) {
                count += prefixSumMap.get(prefixSum - k);
            }

            // Update the map with the current prefix sum
            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        SubaaraySumK solution = new SubaaraySumK();
        int[] nums = {1, 2, 3};
        int k = 3;
        System.out.println(solution.subArraySum(nums, k));  // Output: 2
    }
}
