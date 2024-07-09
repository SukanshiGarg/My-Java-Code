package Recursion;

//Print the nth fibonnaci number of the fibonacci series
// 0 1 1 2 3 5 7 ...

//Fibo(N)=Fibo(n-1)+ Fibo(N-2)

public class FibbonaciNum {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibo(n));
    }
    public static int fibo(int n ){
        //base conditon 
        if(n<2) return n;
        return fibo(n-1)+fibo(n-2);
    }
}
