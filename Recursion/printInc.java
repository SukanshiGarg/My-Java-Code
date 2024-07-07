package Recursion;
public class printInc {
    public static void main(String[] args) {
        int n=5;
        increase(n);
    }
    public static void increase(int n){
        if(n==0) return; //base case
        increase(n-1);    //create a reverse count stack 5 4 3 2 1 0 
        System.out.println(n);  //print as the base case hits (following last in first out )
    }
    
}
