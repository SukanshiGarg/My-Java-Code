import java.util.Arrays;
import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[2*n];

        for(int i=0;i<2*n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr); //sort the arrays 

        int sumFirstHalf=0;
        int secondHalf=0;
        for(int i=0;i<n;i++){
            sumFirstHalf+=arr[i];
        }

        for(int i=n;i<2*n;i++){
            secondHalf+=arr[i];
        }

        //step 3: check if the sums are different.
        if(sumFirstHalf != secondHalf){
            for(int i=0;i<2*n;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            System.out.println("-1");
        }
    }
    
}
