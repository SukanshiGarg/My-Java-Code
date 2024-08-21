/*
 Solution:
- One by one we'll compare both array values from starting 
- Whichever array value is smaller, put that value in new array or list & increase the index by 1
- If both array value is same, then, put any array value in new array or list & inclrease both indexes(i, j)
- At last, if you've any item left in any array, put all values of that array in new array
- Time Complexity: O(n + m) for iterating the both array, where m - first array length, m - second array length
 */

import java.util.Arrays;
public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int arr1[]={1,1,2,2,3,4,5};
        int arr2[]={1,2,3,4,4,5};
        int ans[]=new int[arr1.length + arr2.length];

        //in worst case all the elements will be unique

        //take two pointers
        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j<arr2.length){

            if(arr1[i]<arr2[j]){
                ans[k++]=arr1[i];
                i++;
            }

            else if(arr1[i]>arr2[j]){
                ans[k++]=arr2[j];
                j++;
            }

            else{
                //arr1[i]==arr2[j]
                ans[k++]=arr1[i];
                i++;
                j++;
            }

            // Add remaining elements from arr1, if any
        while (i < arr1.length) {
            ans[k++] = arr1[i++];
        }

        // Add remaining elements from arr2, if any
        while (j < arr2.length) {
            ans[k++] = arr2[j++];
        }
        // Trim the result array to the size of the merged elements
        ans = Arrays.copyOf(ans, k);

        // Print the result
        System.out.println("Union of the two sorted arrays:");
        for (int ele : ans) {
            System.out.print(ele + " ");
        }



        
            
        }

       


    }
}
