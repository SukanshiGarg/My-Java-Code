import java.util.*;
public class Rotate_Array_By_D_Places_lect2 {

    //Logic for array reversal using two pointers approach 
    static void reverse(int arr[],int start, int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }
    static void leftRotate(int arr[],int n , int d){
        if(n==0){
            return;
        }
        //get the effective number of rotations 
        d=d%n;   //multiple of n will bring you back to original array after rotation

        //Step 1: reverse the first d elements
        reverse(arr, 0, d-1);
        //Step 2: reverse the remaining elements 
        reverse(arr, d, n-1);
        //Step 3 : Reverse the entire elements 
        reverse(arr, 0, n-1);

    }
    public static void main(String args[]){
        int n=7;
        int arr[]={1,2,3,4,5,6,7};
        int d=3;
        leftRotate(arr, n, d);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
