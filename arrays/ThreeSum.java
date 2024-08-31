import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(nums);
        for(List<Integer> triplet : result){
            System.out.println(triplet);
        }
    }
    
    public static List<List<Integer>> threeSum(int[]nums){
       List<List<Integer>> result = new ArrayList<>();
       Arrays.sort(nums); //Sort the Array

       for(int i=0; i<nums.length-2;i++){
        //skip duplicates for the first element 
        if(i>0 && nums[i]==nums[i-1]) continue;
        int left=i+1;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[i]+nums[left]+nums[right];
            if(sum==0){
                result.add(Arrays.asList(nums[i],nums[left],nums[right]));

                //skip the duplicates for the second element
                while(left<right && nums[left]==nums[left+1]) left++;

                //skip the duplicates for the third element 
                while(left<right && nums[right]==nums[right-1]) right--;

                left++;
                right--;
            }
            else if(sum<0){
                left++;
            }
            else{
                right--;
            }

        }
       }
       return result;
    }
   
    
}


