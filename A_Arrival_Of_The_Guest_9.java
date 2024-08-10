import java.util.*;
import java.util.Arrays;
public class A_Arrival_Of_The_Guest_9{
    public static void main(String[] args) {
    
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];

       for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt();
       }

       int maxHeight=arr[0];
       int minHeight=arr[0];
       int minIndex=0;
       int maxIndex=0;

       for(int i=0;i<n;i++){

        if(arr[i]>maxHeight){
            maxHeight=arr[i];
            maxIndex=0;
        }
        if(arr[i]<minHeight){
            minHeight=arr[i];
            minIndex=0;
        }

    }

    int swaps=maxIndex+(n-1-minIndex);
    if(maxIndex>minIndex){
        swaps--;
    }
    System.out.println(swaps);



    }
}