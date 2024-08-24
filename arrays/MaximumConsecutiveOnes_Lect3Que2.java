/*
Input: Reads an integer n and then an array of size n.
Initialization: Sets up a counter count to track consecutive 1s and ans to store the maximum count.
Iteration: Iterates through the array, incrementing count for each 1, and resetting count for each 0.
Tracking Maximum: Updates ans with the maximum value of count after each 1.
Output: Prints the maximum number of consecutive 1s found.
 */


//my very own approach
import java.util.*;
public class MaximumConsecutiveOnes_Lect3Que2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int ans=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]==1 ){
                count++;
             
            }
            else{
                count=0;
            }
            ans=Math.max(count,ans);
        }

        System.out.println(ans);
    
    }
    
}

//time complexity : O(N)
//space complexity :O(N)
