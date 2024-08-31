//arr[i]+arr[j]+arr[k]+arr[l]==target 
//brute --> generate all the quads and return the required quad
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class FourSum{
    public static List<List<Integer>> fourSum(int []nums,int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-3;i++){
          if(i>0 && nums[i]==nums[i-1]) continue; //Skip duplicates for i 
          for(int j=i+1 ;j<nums.length;j++){
            if(j>i+1 && nums[j]==nums[j-1]) continue; //skip the duplicates for j 

            int k=j+1;
            int l=nums.length-1;
            while(k<l){
                int sum=nums[i]+nums[j]+nums[k]+nums[l];
                if(sum==target){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                    k++;
                    l--;
                    while (k < l && nums[k] == nums[k - 1]) k++; // Skip duplicates for k
                    while (k < l && nums[l] == nums[l + 1]) l--; // Skip duplicates for l
                   
                   
                }
                else if(sum<target){
                    k++;
                }
                else{
                    l--;
                }
            }
          }
        }
        return result;

    }

    public static void main(String args[]){
        int nums[]={4,3,3,4,4,2,1,2,1,1};
        int target=9;
        List<List<Integer>> result= fourSum(nums,target);

        System.out.println("The quadruplets are: ");
        for (List<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }
}