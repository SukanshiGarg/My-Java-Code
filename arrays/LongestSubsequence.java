import java.util.Set;
import java.util.HashSet;
public class LongestSubsequence {
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
        
    
    public static int longestSuccessiveElements(int arr[]){
        int n=arr.length;
        if(n==0){
            return 0;
        }

        int longest=1;
        Set<Integer> set = new HashSet<>();

        //put all the array elements into set 
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }

        //Find the longest sequence
        for(int it : set){

            //if "it" is a strating number
            if (!set.contains(it - 1)){

            
            int cnt=1;
            int x=it;
            while(set.contains(x+1)){
                x++;
                cnt++;
            }
            longest=Math.max(longest,cnt);
            }
        }
        return longest;

    }
  
    
}
