import java.util.Arrays;

public class MajorityElement2 {
    public static int[] major(int arr[]) {
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;
        int n = arr.length;

        // Step 1: Find potential candidates
        for (int i = 0; i < n; i++) { // Changed to iterate over all elements
            if (arr[i] == candidate1) {
                count1++;
            } else if (arr[i] == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = arr[i];
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = arr[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify the candidates
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate1) {
                count1++;
            } else if (arr[i] == candidate2) {
                count2++;
            }
        }

        // Step 3: Check if the candidates appear more than n/3 times
        int[] result = new int[2];
        int resultCount = 0;
        if (count1 > n / 3) {
            result[resultCount++] = candidate1;
        }
        if (count2 > n / 3) {
            result[resultCount++] = candidate2;
        }

        // If only one candidate is valid, resize the result array
        if (resultCount == 1) {
            return new int[]{result[0]};
        } else if (resultCount == 0) {
            return new int[]{};
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 2, 2, 1, 3, 3};
        int[] majorityElements = major(arr);
        System.out.println("Majority elements: " + Arrays.toString(majorityElements));
    }
}




/*
 class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        if(n==0) return new ArrayList<>();

        //Step 1: Find the potential candidates 
        int candidate1=0;
        int candidate2=0;
        int count1=0;
        int count2=0;

        for(int num : nums){
            if(num==candidate1){
                count1++;
            }
            else if(num == candidate2){
                count2++;
            }
            else if(count2 == 0){
                candidate2 = num;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }

        //step 2 : Verify the candidates 
        count1=0;
        count2=0;
        for(int num : nums){
            if(num == candidate1){
                count1++;
            }
            else if(num == candidate2){
                count2++;
            }

        }
        List<Integer> result = new ArrayList<>();
        if(count1>n/3) result.add(candidate1);
        if(count>n/3) result.add(candidate2);

        return result;
        
    }
}
 */