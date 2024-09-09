package Arrays_2;

public class FindMissingNumberXOR {
    public static int missingNum(int arr[],int n){
       int xor1=0;
       int xor2=0;
       //xor of all the elements of the array 
       for(int i=0;i<n-1;i++){
        xor1 = xor1^arr[i];
       }
       //xor of all elements from 1 to n 
       for(int i=1;i<=n;i++){
        xor2=xor2^i;
       }
       return (xor1^xor2);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int n=5;
        int ans=missingNum(arr,n);
        System.out.println(ans);

    }
    
    
}