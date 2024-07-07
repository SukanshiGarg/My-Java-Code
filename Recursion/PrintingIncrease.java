package Recursion;

public class PrintingIncrease {
    public static void main(String[] args) {
        int n=5;
        increaseNumber(n);
    }
    public static void increaseNumber(int n){
        //base condition 
        if(n==0) return;
        increaseNumber(n-1); // 5 4 3 2 1 
        System.out.println(n); // 1 2 3 4 5 

    }
    
}
