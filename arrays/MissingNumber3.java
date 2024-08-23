import java.util.*;
public class MissingNumber3 {
    public static void main(String[] args) {
        //XOR Gate
        //a^a=0
        //2^2^3^3=0

        //zero xor with any number is the number itself
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }





    }
    public static int missingNumber(int arr[],int n){
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n-1;i++){
            xor2=xor2^arr[i];
            //xor of all array elements 
            xor1=xor1^arr[i];

            xor2=xor2^i;
            //xor upto n-1

        }
        return xor1^xor2;
    }
    
}
