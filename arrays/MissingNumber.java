import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
           int  flag=0;
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    flag++;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
            }
        }
        

        
    }
    
}
