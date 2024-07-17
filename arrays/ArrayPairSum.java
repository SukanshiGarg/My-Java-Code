import java.util.Scanner;
public class ArrayPairSum {
    static int pairSum(int []arr, int target){
        int n=arr.length;
        int ans=0;

        for ( int i = 0; i < arr.length; i++) {  //first number
            for (int j = i; j < arr.length; j++) { //second number
                if(arr[i]+ arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        
        int arr[]=new int [n];
        System.out.println("Enter "+ n + " Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target : ");
        int target=sc.nextInt();

        System.out.println(pairSum(arr, target));
    }


    
}
