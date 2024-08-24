import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class LongestSubarraywithsumK {
    public static int lengthOfSubArr(int arr[], int n , int k){
        Map<Integer,Integer> map= new HashMap<>();
        int sum=0;
        int length=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                length=i+1;
            }

            if(map.containsKey(sum-k)){

                length=Math.max(length, i-map.get(sum-k));
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        }
        return length;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0 ;i < arr.length ;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int ans=lengthOfSubArr(arr, n, k);
        System.out.println(ans);
        
        
    }
    
}
