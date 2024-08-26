
import java.util.ArrayList;
import java.util.Collections;
public class LeadersInAnArray {

    public static ArrayList<Integer> printLead(int arr[], int n){
        ArrayList<Integer> ans = new ArrayList<>();
        

        //Remember: last element of the array is always the leader element 
        int maxSoFar=arr[n-1];
        ans.add(maxSoFar);

        //now check from the end
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxSoFar){
                ans.add(arr[i]);
                maxSoFar=arr[i];
            }
        }

        //now please sort the answer cuz we took the elements from the back
        Collections.sort(ans);

        //return 
        return ans;
    }
    public static void main(String[] args) {
        int n=6;
        int arr[]={10,22,12,3,0,6};

        ArrayList<Integer> ans = printLead(arr, n);


        // Print the result
        System.out.println(ans);  // Output: [6, 12, 22]
        
    }
    
}
