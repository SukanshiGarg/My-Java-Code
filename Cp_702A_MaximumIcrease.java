/*

LinK: https://codeforces.com/problemset/problem/702/A

  You are given array consisting of n integers. Your task is to find the maximum length of an increasing subarray of the given array.

A subarray is the sequence of consecutive elements of the array. Subarray is called increasing if each element of this subarray strictly greater than previous.

Input
The first line contains single positive integer n (1 ≤ n ≤ 105) — the number of integers.

The second line contains n positive integers a1, a2, ..., an (1 ≤ ai ≤ 109).

Output
Print the maximum length of an increasing subarray of the given array
 */
//Tc: O(n)
import java.util.*;
public class Cp_702A_MaximumIcrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        //input the arrays
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println(LongestSubarrayLength(arr));
        
    }
    public static int LongestSubarrayLength(int arr[]){
        int maxLength=1;
        int currentLength=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                currentLength++;
                maxLength=Math.max(currentLength,maxLength);
            }
            else{
                currentLength=1;
            }

        }
        //output the result 
        return maxLength;
    }
    
}
