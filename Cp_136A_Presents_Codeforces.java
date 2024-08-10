import java.util.*;
public class Cp_136A_Presents_Codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n+1];  //ajusted array to n+1 to handle 1-based indexinf

        for(int i=1;i<=n;i++){
           int temp=sc.nextInt();
            arr[temp]=i;
        }

        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
