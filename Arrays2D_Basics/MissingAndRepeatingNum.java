/*

 Instead of counting the occurences every time ,using the hashing technique , we will store the frequency of each number
 between 1 to N. Now, the element with frequnecy 2 will be the repeating number 
 and the element with frquency 0 will be the missing number .

 */

package Arrays2D_Basics;

public class MissingAndRepeatingNum {
    public static void main(String[] args) {
        int a[]={3,1,2,5,4,6,7,5};
        int ans[]=findMissingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {"
                           + ans[0] + ", " + ans[1] + "}");
        
    }
    public static int[] findMissingRepeatingNumbers(int []a){
        int n=a.length; //size of the arrays
        int[] hash = new int[n+1]; //becuz there is a element less

        //update the hash array
        for(int i=0;i<n;i++){
            hash[a[i]]++;
        }

        //Find the repeating and the missing number
        int repeating = -1, missing =-1;
        for(int i=1 ; i<=n ; i++){
            if(hash[i]==2) repeating =i;
            else if(hash[i] == 0 ) missing=i;

            if(repeating !=-1 && missing!=-1){
                break;
            }

            

        }
        int ans[]= {repeating,missing};
            return ans;
       
    }
    
    
}
