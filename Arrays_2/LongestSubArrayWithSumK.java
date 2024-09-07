package Arrays_2;
import java.util.HashMap;
import java.util.Map;
public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=5;
        int len=getLongestLength(arr,n);
        System.out.println(len);

    }
    public static int getLongestLength(int arr[], long k){
        Map<Long,Integer> preSumMap = new HashMap<>();
        long sum=0;
        int maxLength=0;
        
        int n=arr.length; //size of the array 
        for( int i=0;i<n;i++){
            sum+=arr[i];
        
        //if the sum==k , then update the maximum subarray
        if(sum==k){
            
            maxLength=Math.max(maxLength,i+1);
        }
        //calculate the sum of the remaining subaarry i.e. x-k
        long rem=sum-k;

        //calculate the length and update the maxLength
        if(preSumMap.containsKey(rem)){
            int length=i-preSumMap.get(rem);
            maxLength=Math.max(maxLength,length);
        }

        //finallly update the map after checking all the conditions
        if(!preSumMap.containsKey(sum)){
            preSumMap.put(sum,i);
        }
     

    }
    return maxLength;

}

    
    
}
