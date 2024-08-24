import java.util.Scanner;

public class MaximumConsecutive2 {
    
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        int ans=0;


        //intilization and computation in the same steps to avoid repition of for loops

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==1 ){
                count++;
              
            }
            else{
                count=0;
            }
            ans=Math.max(count,ans);
            
        }
       
        
        

        System.out.println(ans);
    
    }
}
