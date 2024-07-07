package Recursion;

public class Factorial_head {
    public static void main(String[] args) {
        //enter a number
        int n=5;
        System.out.println(fact(n));
        System.out.println(factTail(n,1));
    }
    public static int fact(int n){
        //base case : if number is 0 , factorial is 1
        if(n==0) return 1;
        return n*fact(n-1);
    }
    public static int factTail(int n ,int ans){
        //base case:
        if(n==0) return ans;
        return factTail(n-1,ans*n);
    }
    
}
