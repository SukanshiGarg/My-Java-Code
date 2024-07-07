package Recursion;

public class PrintDec {
    public static void main(String[] args) {
        int n=5;
        decrease(n);
    }
    public static void decrease(int n){
      //base condition 
      if(n==0) return ;
      System.out.print(n+" ");
      decrease(n-1);
    }
}
